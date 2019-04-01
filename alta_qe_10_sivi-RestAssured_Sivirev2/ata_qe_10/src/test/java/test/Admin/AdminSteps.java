package test.Admin;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;
//import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class AdminSteps {
    public void postCreate(){

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", "morpheus");
        jsonAsMap.put("job", "zion resident");

        SerenityRest
                .given()
                .contentType("application/Json")
                .body(jsonAsMap)
                .when()
                .post("https://reqres.in/api/users/2")
                .then()
                .log()
                .all()
                .statusCode(201);





    }

    public void validationJSONSchemaPostCreate(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/postCreate.json"));

    }
    public void validationMessage() {
        String status =
                SerenityRest
                        .then()
                        .extract()
                        .path("name");
        Assert.assertTrue(status.equals("morpheus"));
    }

    public void putUpdate(){

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", "morpheus");
        jsonAsMap.put("job", "zion resident");

        SerenityRest
                .given()
                .contentType("application/Json")
                .body(jsonAsMap)
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .log()
                .all()
                .statusCode(200);


    }
    public void  validationJSONSchemaPutUpdate(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/putUpdate.json"));

    }
    public void patchUpdate(){

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", "morpheus");
        jsonAsMap.put("job", "zion resident");

        SerenityRest
                .given()
                .contentType("application/Json")
                .body(jsonAsMap)
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .log()
                .all()
                .statusCode(200);


    }
    public void  validationJSONSchemaPatchUpdate(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/patchUpdate.json"));

    }
    public void getSingleUsers() {


        SerenityRest
                .given()
                .contentType("application/json")
                .header("", "")
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(200);
    }

    public void validationJSONSchemaGetSingleUsers() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/UserDataFormat.json"));
    }

    public void delete(){

        SerenityRest
                .given()
                .contentType("application/Json")
                .when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .log()
                .all()
                .statusCode(204);


    }
    public void  validationJSONSchemaDelete(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/delete.json"));

    }
}


