package test.Register;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class RegisterSteps {
    public void registerSuccess() {
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("email", "peter@klaven");
        jsonAsMap.put("password", "cityslicka");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(jsonAsMap)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(201);
    }

    public void registerFailed() {
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("email", "peter@klaven");

        SerenityRest
                .given()
                .contentType("application/json")
                .header("", "")
                .body(jsonAsMap)
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .log()
                .all()
                .statusCode(400);
    }

    public void validationMessage() {
        String status;
        status = SerenityRest
                .then()
                .extract()
                .path("error");
        Assert.assertTrue(status.equals("Missing password"));


    }

    public void validationJSONSchemaRegisterSuccess(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/register.json"));
    }

    public void validationJSONSchemaRegisterFailed(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/registerFailed.json"));
    }
}
