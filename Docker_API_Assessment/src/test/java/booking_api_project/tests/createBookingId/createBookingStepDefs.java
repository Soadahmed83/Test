package booking_api_project.tests.createBookingId;

import booking_api_project.pages.CreateBooking;
import booking_api_project.pojo.BaseAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createBookingStepDefs extends BaseAPI {


    @Given("I want to create booking with valid  firstName {string} and lastName {string} and depositPaid {string} and totalPrice {string} checkInDate {string} and checkOutDate {string} and additionalNeeds {string}")
    public void iWantToCreateBookingWithValidFirstNameAndLastNameAndDepositPaidAndTotalPriceCheckInDateAndCheckOutDateAndAdditionalNeeds(String firstName,String lastName,String depositPaid,String totalPriceString,String dateCheckIn,String dateCheckOut,String AdditionalNeeds) {
        {
    createBooking.getSpecificBooking(dataProperties.getProperty(firstName),dataProperties.getProperty(lastName),dataProperties.getProperty(depositPaid),dataProperties.getProperty(totalPriceString),
            dataProperties.getProperty(dateCheckIn),dataProperties.getProperty(dateCheckOut),dataProperties.getProperty(AdditionalNeeds));

    }
}
}