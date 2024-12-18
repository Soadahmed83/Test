package booking_api_project.pages;


import booking_api_project.pojo.BaseAPI;
import booking_api_project.pojo.BookingDetails;
import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class specificBookingId extends BaseAPI {


    public void RetrieveBooking(int bookingId) {
       // RestAssured.baseURI = base_url;

        Response response = given()
                .header("Accept", "application/json")
                .when()
                .get("/booking/" + bookingId)
                .then()
                .statusCode(200)
                .extract()
                .response();


        BookingDetails booking = response.as(BookingDetails.class);

        // Assertions
  //     assertEquals("First Name is wrong", booking.getFirstName(), "John");
  //     assertEquals("Last Name is wrong", booking.getLastName(), "Doe");

        System.out.println("Booking retrieved successfully for ID: " + bookingId);
    }
}
