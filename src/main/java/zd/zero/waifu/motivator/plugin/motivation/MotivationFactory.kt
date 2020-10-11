package zd.zero.waifu.motivator.plugin.motivation

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.startup.StartupManager
import zd.zero.waifu.motivator.plugin.ProjectConstants
import zd.zero.waifu.motivator.plugin.assets.MotivationAsset
import zd.zero.waifu.motivator.plugin.assets.VisualMotivationAssetProvider
import zd.zero.waifu.motivator.plugin.assets.WaifuAssetCategory
import zd.zero.waifu.motivator.plugin.motivation.event.MotivationEvent
import zd.zero.waifu.motivator.plugin.onboarding.UpdateNotification
import zd.zero.waifu.motivator.plugin.tools.AssetTools
import zd.zero.waifu.motivator.plugin.tools.doOrElse
import java.util.*

object MotivationFactory {

    fun showMotivationEventForCategory(
        motivationEvent: MotivationEvent,
        waifuAssetCategory: WaifuAssetCategory
    ) = showMotivationEventForCategory(
        motivationEvent, defaultListener, waifuAssetCategory
    )

    fun showMotivationEventFromCategories(
        motivationEvent: MotivationEvent,
        lifecycleListener: MotivationLifecycleListener,
        vararg waifuAssetCategory: WaifuAssetCategory
    ) = showAssetForCategory(
        motivationEvent,
        lifecycleListener,
        { motivationAsset: MotivationAsset ->
            VisualMotivationFactory.constructMotivation(
                    motivationEvent.project,
                    motivationAsset,
                    motivationEvent.alertConfigurationSupplier()
            )
        }
    ) {
        AssetTools.resolveAssetFromCategories(*waifuAssetCategory)
    }

    fun showUntitledMotivationEventFromCategories(
        motivationEvent: MotivationEvent,
        lifecycleListener: MotivationLifecycleListener?,
        vararg waifuAssetCategory: WaifuAssetCategory
    ) = showAssetForCategory(
        motivationEvent,
        lifecycleListener ?: defaultListener,
        { motivationAsset: MotivationAsset ->
            VisualMotivationFactory.constructNonTitledMotivation(
                    motivationEvent.project,
                    motivationAsset,
                    motivationEvent.alertConfigurationSupplier()
            )
        }
    ) {
        AssetTools.resolveAssetFromCategories(*waifuAssetCategory)
    }

    fun showMotivationEventForCategory(
        motivationEvent: MotivationEvent,
        lifecycleListener: MotivationLifecycleListener,
        waifuAssetCategory: WaifuAssetCategory
    ) = showAssetForCategory(
        motivationEvent,
        lifecycleListener,
        { motivationAsset: MotivationAsset ->
            VisualMotivationFactory.constructMotivation(
                    motivationEvent.project,
                    motivationAsset,
                    motivationEvent.alertConfigurationSupplier()
            )
        }
    ) {
        VisualMotivationAssetProvider.createAssetByCategory(waifuAssetCategory)
    }

    private fun showAssetForCategory(
        motivationEvent: MotivationEvent,
        lifecycleListener: MotivationLifecycleListener,
        motivationConstructor: (MotivationAsset) -> WaifuMotivation,
        assetSupplier: () -> Optional<MotivationAsset>
    ) {
        ApplicationManager.getApplication().executeOnPooledThread {
            val project = motivationEvent.project
            assetSupplier()
                .doOrElse({ asset ->
                    val motivation =
                        motivationConstructor(
                            asset
                        ).setListener(
                            object : MotivationListener {
                                override fun onDisposal() {
                                    lifecycleListener.onDispose()
                                }
                            }
                        )
                    if (project.isInitialized) {
                        lifecycleListener.onDisplay()
                        motivation.motivate()
                    } else {
                        StartupManager.getInstance(project)
                            .registerPostStartupActivity {
                                lifecycleListener.onDisplay()
                                motivation.motivate()
                            }
                    }
                }) {
                    UpdateNotification.sendMessage(
                        "'${motivationEvent.title}' unavailable offline.",
                        ProjectConstants.WAIFU_UNAVAILABLE_MESSAGE,
                        project
                    )
                }
        }
    }
}
