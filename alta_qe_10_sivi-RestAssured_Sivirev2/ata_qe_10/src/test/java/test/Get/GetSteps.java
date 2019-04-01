package test.Get;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;


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
                .all()
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
    public void getListUsersUnknown() {


        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get("https://reqres.in/api/unknown")
                .then()
                .log()
                .all()
                .statusCode(200);

    }
    public void getSingleUserUnknown() {


        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get("https://reqres.in/api/unknown/2")
                .then()
                .log()
                .all()
                .statusCode(200);

    }
    public void getSingleUserUnknownNotFound() {


        SerenityRest
                .given()
                .contentType("application/json")
                .header("", "")
                .when()
                .get("https://reqres.in/api/unknown/23")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(404);

    }
    public void getDelayedResponse() {


        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get("https://reqres.in/api/users?delay=3")
                .then()
                .log()
                .all()
                .statusCode(200);

    }
//    public void validationMessage(){
//        String status =
//                SerenityRest
//                        .then()
//                        .extract()
//                        .path("page");
//        Assert.assertTrue(status.equals(2));
//    }


    public void validationJSONSchemaGetListUsers() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/UserList.json"));
    }


    public void validationJSONSchemaGetSingleUsersNotFound() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getSingleUserNotFound.json"));

    }
    public void validationJSONSchemaGetListUsersUnknown() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getListResource.json"));
    }
    public void validationJSONSchemaGetSingleUserUnknown() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getSingleResource.json"));
    }
    public void validationJSONSchemaGetSingleUserUnknownNotFound() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getSingleResourceNotFound.json"));
    }

    public void validationJSONSchemaGetDelayedResponse() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/getDelayed.json"));
    }
}