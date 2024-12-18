package booking_api_project.tests.searchForBoockingId;

import booking_api_project.pages.specificBookingId;
import booking_api_project.pojo.BaseAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.testng.AssertJUnit.assertEquals;

public class searchForBookingIdStepDef extends BaseAPI {

    private specificBookingId bookingIdnumber = new specificBookingId();
    @Given("I retrieve the booking with ID {int}")
    public void iRetrieveTheBookingWithID(int bookingIdNumber) {
        // Retrieve data for the given bookingIdNumber
        System.out.println("Retrieving booking with ID: " + bookingIdNumber);
        bookingIdnumber.RetrieveBooking(bookingIdNumber);
    }

    @Then("the booking details should have firstName {string} and lastName {string}")
    public void theBookingDetailsShouldHaveFirstNameAndLastName(String actualFirstName, String actualLastName) {
        String expectedFirstName = dataProperties.getProperty("booking.1.firstName");
        String expectedLastName = dataProperties.getProperty("booking.1.lastName");

        assertEquals("First Name is wrong", expectedFirstName, actualFirstName);
        assertEquals("Last Name is wrong", expectedLastName, actualLastName);
    }
}
