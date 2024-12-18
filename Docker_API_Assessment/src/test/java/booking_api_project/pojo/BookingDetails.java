package booking_api_project.pojo;

import booking_api_project.pojo.BookingDates;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingDetails {

    // Booking request data

    private String firstname;
    private String lastname;
    private int totalPrice;
    private boolean depositPaid;
    private BookingDates bookingdates;
    private String additionalNeeds;


    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public boolean isDepositPaid() {
        return depositPaid;
    }
    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }
    public BookingDates getBookingdates() {
        return bookingdates;
    }
    public void setBookingDates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }
    public String getAdditionalNeeds() {
        return additionalNeeds;
    }
    public void setAdditionalNeeds(String additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }


}
