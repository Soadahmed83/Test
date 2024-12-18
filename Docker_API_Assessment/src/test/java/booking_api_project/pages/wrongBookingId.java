package booking_api_project.pages;


import booking_api_project.pojo.BaseAPI;
import static io.restassured.RestAssured.given;

public class wrongBookingId extends BaseAPI {


    public void testRetrieveBooking(int bookingId) {
       given()
                .header("Accept", "application/json")
                .when()
                .get("/booking/"+ bookingId)
                .then()
                .statusCode(404);
    }


}
