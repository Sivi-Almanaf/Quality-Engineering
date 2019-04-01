package test.Get;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

//import java.util.HashMap;
//import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GetSteps {

    public void getListUsers() {


        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(200);

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

    public void getSingleUserNotFound() {

        SerenityRest
                .given()
                .contentType("application/json")
                .header("", "")
                .when()
                .get("https://reqres.in/api/users/23")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(404);

    }

    public void validationMessage() {
        String status =
                SerenityRest
                        .then()
                        .extract()
                        .path("error");
        Assert.assertTrue(status.equals("not found data"));
    }

    public void validationJSONSchemaGetListUsers() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getListUsers.json"));
    }


    public void validationJSONSchemaGetSingleUsers() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getSingleUser.json"));
    }

    public void validationJSONSchemaGetSingleUsersNotFound() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getSingleUserNotFound.json"));

    }

    public void validationJSONSchemaGetDelayedResponse() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getDelayed.json"));
    }
}