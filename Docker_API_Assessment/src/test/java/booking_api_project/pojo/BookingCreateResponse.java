package booking_api_project.pojo;

import booking_api_project.pojo.BookingDetails;

public class BookingCreateResponse {
    private int bookingId;
    private BookingDetails booking;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BookingDetails getBooking() {
        return booking;
    }

    public void setBooking(BookingDetails booking) {
        this.booking = booking;
    }

}
