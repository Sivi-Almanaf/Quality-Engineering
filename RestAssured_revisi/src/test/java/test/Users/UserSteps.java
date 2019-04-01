package test.Users;

import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class UserSteps {
    public void createSuccess(){

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", "morpheus");
        jsonAsMap.put("job", "leader");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(jsonAsMap)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(201);

    }

    public void updateSuccess(){
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", "morpheus");
        jsonAsMap.put("job", "zion resident");

        SerenityRest
                .given()
                .contentType("application/json")
                .header("","")
                .body(jsonAsMap)
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .log()
                .all()
                .statusCode(200);

    }
    public void updatePatch() {
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", "morpheus");
        jsonAsMap.put("job", "zion resident");

        SerenityRest
                .given()
                .contentType("application/json")
                .header("", "")
                .body(jsonAsMap)
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .log()
                .all()
                .statusCode(200);

    }


    public void validationJSONSchemaCreateSuccess(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/postCreate.json"));
    }

    public void validationJSONSchemaUpdateSuccess(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/putUpdate.json"));
    }
    public void validationJSONSchemaUpdatePatch(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/patchUpdate.json"));
    }
}
