package booking_api_project.tests;

import booking_api_project.pages.BookingDeleteApi;
import booking_api_project.pages.TokenGenerator;
import booking_api_project.pojo.BaseAPI;
import booking_api_project.properties_reading.ReadPropertiesFile;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

import java.io.IOException;

public class HooksHandler extends BaseAPI {
    private BookingDeleteApi BookingDeleteAbi = new BookingDeleteApi();


@Before

public void setup () throws IOException {

    environmentProperties = ReadPropertiesFile.getBookingURLProperties();
    dataProperties = ReadPropertiesFile.getBookingDataProperties();

    environmentProperties = ReadPropertiesFile.getBookingURLProperties();
    dataProperties = ReadPropertiesFile.getBookingDataProperties();
    base_url = environmentProperties.getProperty("BASE_URL");
    RestAssured.baseURI = base_url;

    BookingDeleteAbi = new BookingDeleteApi();
    token = TokenGenerator.generateToken();


}





    }
