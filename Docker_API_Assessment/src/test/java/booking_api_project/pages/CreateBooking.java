package booking_api_project.pages;

import booking_api_project.pojo.BaseAPI;
import booking_api_project.pojo.BookingCreateResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import booking_api_project.pojo.BookingDates;
import booking_api_project.pojo.BookingDetails;
import static io.restassured.RestAssured.given;

public class CreateBooking extends BaseAPI {

    public void getSpecificBooking(String firstName,String lastName,String depositPaid,String totalPriceString,String dateCheckIn,String dateCheckOut,String AdditionalNeeds) {

        RestAssured.baseURI = base_url;

        BookingDates dates = new BookingDates();
        dates.setCheckIn(dateCheckIn);
        dates.setCheckOut(dateCheckOut);

        BookingDetails booking = new BookingDetails();
        booking.setFirstName(firstName);
        booking.setLastName(lastName);
        int totalPrice = Integer.parseInt(totalPriceString);
        booking.setTotalPrice(totalPrice);

        booking.setDepositPaid(true);
        booking.setBookingDates(dates);
        booking.setAdditionalNeeds(AdditionalNeeds);

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(booking)
                .post("/booking");


        System.out.println("Status Code: " + response.getStatusCode());
        BookingCreateResponse bookingResponse = response.as(BookingCreateResponse.class);
        System.out.println("Booking ID: " + bookingResponse.getBookingId());
        System.out.println("First Name: " + bookingResponse.getBooking().getFirstName());
        System.out.println("Last Name: " + bookingResponse.getBooking().getLastName());


        org.testng.Assert.assertEquals(response.getStatusCode(), 200, "Status Code should be 200");
        org.testng.Assert.assertEquals(bookingResponse.getBooking().getFirstName(), firstName, "First Name does not match");
        org.testng.Assert.assertEquals(bookingResponse.getBooking().getLastName(), lastName, "Last Name does not match");
    }
}
