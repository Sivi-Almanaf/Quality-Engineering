package test.Login;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class LoginSteps {

    public void loginSuccess(){

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("email", "peter@klaven");
        jsonAsMap.put("password", "cityslicka");

        SerenityRest
                .given()
                    .contentType("application/json")
                    .body(jsonAsMap)
                .when()
                    .post("https://reqres.in/api/login")
                .then()
                    .log()
                    .ifValidationFails()
                    .statusCode(200);

    }

    public void loginFailed(){
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("email", "peter@klaven");

        SerenityRest
                .given()
                .contentType("application/json")
                .header("","")
                .body(jsonAsMap)
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .log()
                .all()
                .statusCode(400);

    }

    public void validationMessage(){
        String status =
        SerenityRest
                .then()
                .extract()
                .path("error");
        Assert.assertTrue(status.equals("Missing password"));
    }

    public void validationJSONSchemaLoginSuccess(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/login.json"));
    }

    public void validationJSONSchemaLoginFailed(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/loginFailed.json"));
    }
}
