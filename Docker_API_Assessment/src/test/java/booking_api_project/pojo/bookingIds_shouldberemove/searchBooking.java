package booking_api_project.pojo.bookingIds_shouldberemove;

import java.time.LocalDate;

public class searchBooking {

    private String firstname;
    private String lastname;
    private LocalDate checkin;
    private LocalDate checkout;


    public searchBooking() {}

    public searchBooking(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public searchBooking( LocalDate checkin, LocalDate checkout) {

        this.checkin = checkin;
        this.checkout = checkout;
    }

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

    public LocalDate getCheckIn() {
        return checkin;
    }

    public void setCheckIn(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckOut() {
        return checkout;
    }

    public void setCheckOut(LocalDate checkout) {
        this.checkout = checkout;
    }
}


