# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
- Test add release notes unreleased

## [2.0.2]
### Added
- Test add release notes 2.0.2

## [2.0.1] - 2021-04-12
### Fixed

- [WMP-304](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/304) Fixed new user on-boarding on the 2021.1 Builds.

## [2.0.0] - 2021-02-01

### Added

- [WMP-225](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/225) Log Watching
- [New display options](https://github.com/Unthrottled/AMII#display️)
    - Notification positioning
    - Timed or Focus loss dismissal options
- [Silence Breaker](https://github.com/Unthrottled/AMII/pull/43)
- Added Anime Openings on project open
- Volume adjustment
- Better random asset distribution
- A lot more assets!

### Changed
- [WMP-288](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/288) Depending on the [Anime Meme plugin](https://github.com/Unthrottled/AMII) for motivation now.

The Anime Meme (AMII) plugin includes the following changes:

- Removed titled notifications.
- Only select notifications have sound the rest are silent.
- Your previous configurations will be lost (Sorry!).
- Haven't implemented `Sayonara sound` on project exit yet.
- Haven't implemented `Disable in Distraction Free Mode or Presentation Mode` yet.
- `Motivate Me (alt+m)` is now `Show random Ani-Meme (alt+r)`
- Sound is either on or off, no granular control across events.

### Fixed

- [WMP-247](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/247) Enhanced content preference selection
- [WMP-262](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/262) String literals to bundle migration
- [WMP-163](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/163) Migrate to `ExteralSystemTaskState`
- [WMP-285](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/285) Sound playback issue
- [WMP-282](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/282) Concurrent Modification Errors
- [WMP-273](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/273) Notification Display Awareness
- Task failure events no longer occur on `Build Canceled` events

## [1.4.0] - 2020-11-08

### Added

- [WMP-235](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/235) Relax, it's not that big of a deal
- [WMP-193](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/193) Frustration Cool down over time
- [WMP-174](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/174) Just your Waifu
- [WMP-142](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/142) Alert Motivation Context
- [WMP-248](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/248) Support for Intellij IDEA 2021.1
- [WMP-241](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/241) Enhanced plugin installation experience for new users!
- [WMP-251](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/251) Improved toolbar menus

### Fixed

- Fixed [WMP-229](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/229) Issue writing local asset checks on mult-thread
- Fixed [WMP-224](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/224) Waifu of the Day doesn't show up on a fresh install


## [1.3.0] - 2020-09-27

### Added

- [WMP-190](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/190) Organized settings menu.
- [WMP-155](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/155) When any executed process through the IDE fails with an un-allowed exit code then you get a motivation event.
- [WMP-194](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/194) Can trigger a manual update of the list of motivation assets from the remote source.
- [WMP-182](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/182) Added configurable personality to your virtual companion.
- [WMP-159](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/159) Plugin can be used offline now.
- [WMP-157](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/157) `Motivate Me` now uses visual notifications.
- [WMP-133](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/133) When your code fails to build you'll get a `Surprised` or `Disapointed` event. The next time that your build succeeds, then you'll get a `Celebration` or `Smug` event.
- [WMP-154](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/154) When the user's IDE remains idle for a configured amount of time (defaults to 5 minutes) then the plugin will display a bored/waiting anime girl.

### Fixed

- Fixed [WMP-153](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/153) Successful test runs with ignored tests now emit success motivation events.
- Fixed [WMP-178](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/178) Plugin actions can now be used while IDE is indexing.
- Fixed [WMP-186](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/186) Can close projects before they are initialized.
- Fixed [WMP-198](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/198) Enabled plugin to work without full IDE restart.
- Fixed [WMP-209](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/209) Waifu of the Day colors should come from theme look and feel
- Fixed [WMP-167](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/167) Sound player runtime exception


## [1.2.0] - 2020-08-21

### Added

- [WMP-097](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/97) Ability to disable 'Motivate Me' notification
- [WMP-080](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/80) Improvements on toolbar menu
- [WMP-103](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/103) Ability to enable 'Do Not Disturb' mode on different viewing modes
- [WMP-102](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/102) Welcome dialog for newly installed plugin or new version
- [WMP-100](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/100) Add images associated to the alert notification

### Fixed

- Fix [WMP-110](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/110) Waifu unit tester executes multiple times
- Fix [WMP-112](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/112) Multiple different startup sounds
- Fix [WMP-124](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/124) Multiple test notifications
- Fix [WMP-144](https://github.com/waifu-motivator/waifu-motivator-plugin/issues/144) Cancelled tests registers as passed event

## [1.1.2] - 2020-04-24

### Fixed
- Fix: WMP-083 Plugin state AssertionError
- Fix: WMP-084 Webstorm 2020.1 NoClassDefFoundError

## [1.1.1] - 2020-04-18

### Fixed
- Fix: WMP-075 No image for Nejire Hado for Waifu of the Day

## [1.1.0] - 2020-04-12

### Added
- WMP-073 Properly style Waifu of the Day based on theme
- WMP-069 Add settings navigation menu on Plugin toolbar menu
- WMP-066 Migration to dynamic plugin
- WMP-060 Support IDEA Version to 2020.1
- WMP-015 Separate settings for alert
- WMP-056 Support for playing different sound formats
- WMP-053 Global project closing sayonara
- WMP-026 Create a message bundle for WMP
- WMP-037 Create Waifu of the Day provider
- WMP-050 Update text 'source' to 'sauce
- WMP-051 Include more assets for waifu of the day and events
<details>
  <summary>Waifu of The Day</summary>

    * Update Aqua image
    * Shinobu Kocho
    * Mitsuri Kanroji
    * Kanae Kocho
    * Kanao Tsuyuri
    * Toru Hagakure
    * Ochaco Uraraka
    * Kyoka Jiro
    * Nejire Hado
    * Eri
    * Himiko Toga
    * Ishtar
    * Lucy Heartfilia
    * Erza Scarlet
    * Wendy Marvell
    * Nao Tomori
    * Kotoko Iwanaga
    * Inori Yuzuriha
    * Miku Nakano
    * Ichika Nakano
    * Nino Nakano
    * Itsuki Nakano
    * Yotsuba Nakano
</details>

<details>
  <summary>Alert Assets</summary>

    * Nyaaan
    * Wwwwwwaaaaaaaaaaaaaaaaaaaaah
    * Wwwwaaaaaooowww
    * OH MY GAH
</details>


## [1.0.1] - 2020-01-01

### Added
- Add more assets for Waifu of the Day
- WMP-039 asset provider not properly categorizing on the next invocation
- WMP-041 update images for dark theme
- WMP-042 resolve sound stopping when the alert is expired

## [1.0.0] - 2019-12-30

### Added
- WMP-008 waifu of the day
- WMP-022 random motivations on all alerts
- WMP-027 sayonara
- WMP-028 persist the consumed assets to play until all of it are consumed
- WMP-029 stop playing the audio if the alert was closed

## [0.1.1] - 2019-12-03

### Changed
- Bumped IDEA for compatibility to >= 2019.3

## [0.1.0] - 2019-12-03

### Added
- Initial EAP Release for IDEA >= 2019.2.3
