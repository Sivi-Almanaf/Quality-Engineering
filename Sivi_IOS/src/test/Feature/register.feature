Feature: Form Register
  File ini berguna untuk mengeksekusi form register ke dalam cucumber

  @Register
  Scenario: register user baru
  form register dengan Nama lengkap, No.handphone, Email, dan password

    Given user berada pada halaman register
    When user mengklik button register
    And user mengisi nama lengkap "bedjo"
    And user mengisi nomer handhphone "085790357743"
    And user password "1234567"
    And user mengklik kolom button register
    Then direct to halaman OTP konfirmasi kode
