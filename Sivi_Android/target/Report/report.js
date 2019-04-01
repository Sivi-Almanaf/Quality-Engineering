$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basic.feature");
formatter.feature({
  "line": 1,
  "name": "Form Register",
  "description": "File ini berguna untuk mengeksekusi form register ke dalam cucumber",
  "id": "form-register",
  "keyword": "Feature"
});
formatter.before({
  "duration": 166172,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "register user baru",
  "description": "form register dengan input username, email, password, dan name",
  "id": "form-register;register-user-baru",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user telah menginstall aplikasi",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user mengklik button folder dokumen",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user mengklik field username dan input valid username \"Sivi\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user mengklik field email dan input valid email \"salmanashahab@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user mengklik field email password dan input valid password \"qazxswe\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user mengklik field name dan menghapus nama yang tertera",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user mengisi field name dengan valid nama \"Sivi Almanaf\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user mengklik bahasa pemograman dan pilih python",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user mengklik box button sampai checklist",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user mengklik button register user",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "direct to halaman verify user",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verifikasi setiap input dengan interface halaman verify user nama \"Sivi Almanaf\" username \"Sivi\" Password \"qazxswe\" Email \"salmanashahab@gmail.com\" progammingLanguage \"Python\" validasi \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_telah_menginstall_aplikasi()"
});
formatter.result({
  "duration": 27378806144,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mengklik_button_folder_dokumen()"
});
formatter.result({
  "duration": 548855897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sivi",
      "offset": 55
    }
  ],
  "location": "StepDefinition.user_mengklik_field_username_dan_input_valid_username(String)"
});
formatter.result({
  "duration": 9249485770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salmanashahab@gmail.com",
      "offset": 49
    }
  ],
  "location": "StepDefinition.user_mengklik_field_email_dan_input_valid_email(String)"
});
formatter.result({
  "duration": 7585349285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qazxswe",
      "offset": 61
    }
  ],
  "location": "StepDefinition.user_mengklik_field_email_password_dan_input_valid_password(String)"
});
formatter.result({
  "duration": 6388160905,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mengklik_field_name_dan_menghapus_nama_yang_tertera()"
});
formatter.result({
  "duration": 5760934723,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sivi Almanaf",
      "offset": 43
    }
  ],
  "location": "StepDefinition.user_mengisi_field_name_dengan_valid_nama(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 7204172652,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mengklik_bahasa_pemograman_dan_pilih_python()"
});
formatter.result({
  "duration": 1334481839,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mengklik_box_button_sampai_checklist()"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 2174557475,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mengklik_button_register_user()"
});
formatter.result({
  "duration": 460708116,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.direct_to_halaman_verify_user()"
});
formatter.result({
  "duration": 536963585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sivi Almanaf",
      "offset": 67
    },
    {
      "val": "Sivi",
      "offset": 91
    },
    {
      "val": "qazxswe",
      "offset": 107
    },
    {
      "val": "salmanashahab@gmail.com",
      "offset": 123
    },
    {
      "val": "Python",
      "offset": 168
    },
    {
      "val": "true",
      "offset": 186
    }
  ],
  "location": "StepDefinition.verifikasi_setiap_input_dengan_interface_halaman_verify_user_nama_username_Password_Email_progammingLanguage_validasi(String,String,String,String,String,String)"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 3883200519,
  "status": "passed"
});
});