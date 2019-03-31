Feature: Basic Feature
  File iniberguna untuk mengeksekusi basic function ke dalam cucumber

@Scr
Scenario: Basic Scenario 1
  ini adalah keterangan basic scenario 1

  Given user berada di Main Page
  When user mengklik button Preference
  And user mengklik button Preference dependencies
  And user mengklik checkbox Wifi
  And user mengklik button wifi setting
  Then pop Up Wifi Setting Muncul
  And user mengisi deskripsi Wifi Setting "WiFi ATA QE Sce"
  And user mengklik ok

@scenariOutline
Scenario Outline: Basic Scenario Outline
  ini basic scenario outline

    Given user berada di Main Page
    When user mengklik button Preference
    And user mengklik button Preference dependencies
    And user mengklik checkbox Wifi
    And user mengklik button wifi setting
    Then pop Up Wifi Setting Muncul
    And user mengisi deskripsi Wifi Setting "<deskripsiWifi>"
    And user mengklik ok

  Examples:
  |deskripsiWifi|
  |WiFi ATA QE Example 1|
  |WiFi ATA QE Example 2|

  @dev
  Scenario: Kirim SMS
    Given user berada di Main Page
    When user mengklik button OS
    And user mengklik button sms messaging
    And user mengklik checkbox Enable SMS Broadcast Receiver
    And user mengisi recipient number "085720191669"
    And user mengisi message body "Test SMS ATA QE"
    And user mengklik tombol SEND
    Then munculnotifikasi "Message Sent!"



