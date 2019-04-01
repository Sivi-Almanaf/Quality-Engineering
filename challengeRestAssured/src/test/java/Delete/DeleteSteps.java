//package Delete;
//
//import net.serenitybdd.rest.SerenityRest;
//import org.junit.Assert;
//import utils.Endpoints;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
//
//public class DeleteSteps implements Endpoints {
//    public void deleteValidId(){
//
//
//        SerenityRest
//                .given()
//                .contentType(contentType)
//                .header("", "")
//                .when()
//                .delete(Url+deletePetId)
//                .then()
//                .log()
//                .ifValidationFails()
//                .statusCode(200);
//
//    }
//
//    public void validationJSONSchemaDeleteValidId(){
//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/deleteValidId.json"));
//
//    }
//    public void validationMessage() {
//        String status =
//                SerenityRest
//                        .then()
//                        .extract()
//                        .path("Error");
//        Assert.assertTrue(status.equals("Not Found"));
//    }
//
//    public void deleteInvalidId(){
//
//        SerenityRest
//                .given()
//                .contentType(contentType)
//                .header("", "")
//                .when()
//                .delete(Url+deletePetInvalidId)
//                .then()
//                .log()
//                .all()
//                .statusCode(400);
//
//
//    }
//    public void  validationJSONDeleteInvalidId(){
//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/deleteInvalidId.json"));
//    }
//
//
//    public void deletePetNotFound(){
//
//        SerenityRest
//                .given()
//                .contentType(contentType)
//                .header("", "")
//                .when()
//                .delete(Url+deletePetNotFound)
//                .then()
//                .log()
//                .all()
//                .statusCode(404);
//
//
//    }
//    public void  validationJSONSchemaDeletePetNotFound(){
//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/deleteDataNotFound.json"));
//
//    }
//    public void deletePurchaseOrderInvalidId() {
//
//
//        SerenityRest
//                .given()
//                .contentType(contentType)
//                .header("", "")
//                .when()
//                .delete(Url+deleteOrderId)
//                .then()
//                .log()
//                .all()
//                .statusCode(400);
//    }
//
//    public void validationJSONSchemaDeletePurchaseOrderInvalidId() {
//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/deletePurchaseOrderByID.json"));
//    }
//
//    public void deletePurchaseOrderNotFound(){
//
//        SerenityRest
//                .given()
//                .contentType(contentType)
//                .header("", "")
//                .when()
//                .delete(Url+deletePurchaseOrderNotFound)
//                .then()
//                .log()
//                .all()
//                .statusCode(404);
//
//    }
//    public void  validationJSONSchemaDeletePurchaseOrderNotFound(){
//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/deletePurchaseOrderNotFound.json"));
//
//    }
//
//    public void deleteUserNotFoundFromDatabase(){
//
//        SerenityRest
//                .given()
//                .contentType(contentType)
//                .header("", "")
//                .when()
//                .delete(Url+deleteUsername2)
//                .then()
//                .log()
//                .all()
//                .statusCode(404);
//
//    }
//    public void  validationJSONSchemaDeleteUserNotFoundFromDatabase(){
//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/deleteUserNotFoundFromDatabase.json"));
//
//    }
//
//    public void deleteUserFromDatabaseByInvalidId(){
//
//        SerenityRest
//                .given()
//                .contentType(contentType)
//                .header("", "")
//                .when()
//                .delete(Url+deleteUsername1)
//                .then()
//                .log()
//                .all()
//                .statusCode(400);
//
//    }
//    public void  validationJSONSchemaDeleteUserFromDatabaseByInvalidId(){
//        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/deleteUserFromDatabaseByInvalidId.json"));
//
//    }
//
//}
//
//
