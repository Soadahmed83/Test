package booking_api_project.pages;

import booking_api_project.pojo.BaseAPI;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class BookingDeleteApi extends BaseAPI {


    public static Response deleteBookingWithCookie(int bookingId , String token) {
        return RestAssured
                .given()
                .baseUri(base_url)
                .basePath("/booking/" + bookingId)
                .header("Content-Type", "application/json")
                .header("Cookie", "token=" + token)
                .when()
                .delete();
    }


    public static boolean doesBookingExist(int bookingId) {
        Response response = RestAssured
                .given()
                .baseUri(base_url)
                .basePath("/booking/" + bookingId)
                .when()
                .get();

        return response.getStatusCode() == 200;
    }
}
