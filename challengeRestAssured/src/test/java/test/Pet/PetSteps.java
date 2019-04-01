package test.Pet;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;
import utils.Endpoints;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PetSteps implements Endpoints {
    public void postDataCorrectly() {
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("id", 0);
        jsonAsMap.put("category", new HashMap<String, Object>() {
            {put("id", 0); }
            { put("nama", "string"); }});
        jsonAsMap.put("nama", "doggie");
        jsonAsMap.put("photoUrls", new String[]{"string"});
        jsonAsMap.put("tags", new Object[]{new HashMap<String, Object>() {{
            put("name", "string");
        }}});
        jsonAsMap.put("status", "avaliable");


        SerenityRest
                .given()
                .contentType(contentType)
                .body(jsonAsMap)
                .when()
                .post(Url + "/pet")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(200);

    }

    public void validationJSONPostDataCorrectly() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/PostDataCorrectly.json"));

    }

    public void putDataCorrectly() {

        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("id", 0);
        jsonAsMap.put("category", new HashMap<String, Object>() {
            {put("id", 0); }
            { put("nama", "string"); }});
        jsonAsMap.put("nama", "doggie");
        jsonAsMap.put("photoUrls", new String[]{"string"});
        jsonAsMap.put("tags", new Object[]{new HashMap<String, Object>() {{
            put("name", "string");
        }}});
        jsonAsMap.put("status", "avaliable");


        SerenityRest
                .given()
                .contentType(contentType)
                .body(jsonAsMap)
                .when()
                .put(Url + "/pet")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(200);

    }

    public void validationJSONPutDataCorrectly() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/PutDataCorrectly.json"));

    }


    public void getPetValidId() {


        SerenityRest
                .given()
                .contentType(contentType)
                .when()
                .get(Url+"/pet/23")
                .then()
                .log()
                .all()
                .statusCode(200);

    }

    public void validationJSONGetPetValidId() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/GetPetValidId.json"));

    }


    public void deleteUserFromDatabaseValidId() {


        SerenityRest
                .given()
                .contentType(contentType)
                .when()
                .delete(Url+"pet/23")
                .then()
                .log()
                .all()
                .statusCode(405);

    }


}
