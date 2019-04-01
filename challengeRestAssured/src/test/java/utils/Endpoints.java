package utils;

public interface Endpoints {

    String Url = "https://petstore.swagger.io/v2";
    String deletePetId = "/pet/2";
    String deletePetInvalidId = "/pet/10000";
    String deletePetNotFound = "/pet/32";
    String deleteOrderId = "/store/order/2";
    String deletePurchaseOrderNotFound = "/store/order/45";
    String deleteUsername1 = "/user/cat";
    String deleteUsername2 = "/user/fish";
    String contentType = "application/Json";
    String apyKey = "special-key";



}
