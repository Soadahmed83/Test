package booking_api_project.pojo.bookingIds_shouldberemove;

import java.util.List;

public class bookingResponse {
    private List<BookingId> object;

    public bookingResponse() {}
    public bookingResponse(List<BookingId> object) {
        this.object = object;
    }
    public List<BookingId> getObject() {
        return object;
    }

    public void setObject(List<BookingId> object) {
        this.object = object;
    }

}
