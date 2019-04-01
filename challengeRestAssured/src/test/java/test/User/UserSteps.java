package test.User;



import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;
import utils.Endpoints;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class UserSteps implements Endpoints{
    public void postCreateUser() {
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("id", 0);
        jsonAsMap.put("username", "string");
        jsonAsMap.put("firstName", "string");
        jsonAsMap.put("lastName", "string");
        jsonAsMap.put("email", "string");
        jsonAsMap.put("password", "string");
        jsonAsMap.put("phone", "string");
        jsonAsMap.put("userStatus", 0);

        SerenityRest
                .given()
                .contentType(contentType)
                .body(jsonAsMap)
                .when()
                .post(Url + "/user")
                .then()
                .log()
                .all()
                .statusCode(200);


    }
    public void validationJSONPostCreateUser() {
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/PostUser.json"));

    }


}
