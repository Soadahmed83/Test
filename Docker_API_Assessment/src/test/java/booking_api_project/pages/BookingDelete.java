package booking_api_project.pages;

import booking_api_project.pojo.BaseAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import booking_api_project.pages.BookingDeleteApi;

public class BookingDelete extends BaseAPI {

    public void DeleteBookingWithCookie_Success(int existBookingId) {
        int bookingId = existBookingId; // ID to delete

        Assert.assertTrue(BookingDeleteApi.doesBookingExist(bookingId), "Booking ID does not exist.");
        Response response = BookingDeleteApi.deleteBookingWithCookie(bookingId, token);

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.asString(), "Created");
    }


    public void testDeleteBooking_IDNotExist(int notExistBookingId) {
        int nonExistingBookingId = notExistBookingId;

        Response response = BookingDeleteApi.deleteBookingWithCookie(nonExistingBookingId, token);

        Assert.assertEquals(response.getStatusCode(), 405, "Expected 404 Not Found response.");
        Assert.assertTrue(response.asString().contains("Not"), "Response body does not match.");
    }
}
