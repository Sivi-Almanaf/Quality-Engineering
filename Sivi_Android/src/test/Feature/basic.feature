Feature: Form Register
  File ini berguna untuk mengeksekusi form register ke dalam cucumber

  @Register
  Scenario: register user baru
  form register dengan input username, email, password, dan name

    Given user telah menginstall aplikasi
    When user mengklik button folder dokumen
    And user mengklik field username dan input valid username "Sivi"
    And user mengklik field email dan input valid email "salmanashahab@gmail.com"
    And user mengklik field email password dan input valid password "qazxswe"
    And user mengklik field name dan menghapus nama yang tertera
    And user mengisi field name dengan valid nama "Sivi Almanaf"
    And user mengklik bahasa pemograman dan pilih python
    And user mengklik box button sampai checklist
    And user mengklik button register user
    Then direct to halaman verify user
    And verifikasi setiap input dengan interface halaman verify user nama "Sivi Almanaf" username "Sivi" Password "qazxswe" Email "salmanashahab@gmail.com" progammingLanguage "Python" validasi "true"





