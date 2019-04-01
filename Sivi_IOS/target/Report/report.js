$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "File ini berguna untuk mengeksekusi Login Success ke dalam cucumber",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 236676,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login Success",
  "description": "form Input email or phone number dan isi passowrd",
  "id": "login;login-success",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user berada pada halaman Login",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user mengklik button Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user mengisi email or Phone number \"085790357741\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user mengisi password \"12345qwerty\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user mengklik kolom button Sign In",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "direct to halaman depan aplikasi sepulsa",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_berada_pada_halaman_Login()"
});
formatter.result({
  "duration": 23417127365,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_mengklik_button_Sign_In()"
});
formatter.result({
  "duration": 1713693036,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "085790357741",
      "offset": 36
    }
  ],
  "location": "steps.user_mengisi_email_or_Phone_number(String)"
});
formatter.result({
  "duration": 8102122982,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345qwerty",
      "offset": 23
    }
  ],
  "location": "steps.user_mengisi_password(String)"
});
formatter.result({
  "duration": 9896276375,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_mengklik_kolom_button_Sign_In()"
});
formatter.result({
  "duration": 3107935337,
  "status": "passed"
});
formatter.match({
  "location": "steps.direct_to_halaman_depan_aplikasi_sepulsa()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 7036877568,
  "status": "passed"
});
});