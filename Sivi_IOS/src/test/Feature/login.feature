Feature: Login
  File ini berguna untuk mengeksekusi Login Success ke dalam cucumber

  @Login
  Scenario: Login Success
  form Input email or phone number dan isi passowrd

    Given user berada pada halaman Login
    When user mengklik button Sign In
    And user mengisi email or Phone number "085790357741"
    And user mengisi password "12345qwerty"
    And user mengklik kolom button Sign In
    Then direct to halaman depan aplikasi sepulsa