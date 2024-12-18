package booking_api_project.pages;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class TokenGenerator {

    private static final String BASE_URL = "https://restful-booker.herokuapp.com";

    public static String generateToken() {
        String payload = "{ \"username\": \"admin\", \"password\": \"password123\" }";

        Response response = RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post();
     if (response.getStatusCode() == 200) {
        return response.jsonPath().getString("token");
    } else {
        throw new RuntimeException("Failed to generate token. Response: " + response.asString());
    }
}


}
