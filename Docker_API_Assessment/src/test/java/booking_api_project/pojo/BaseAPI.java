package booking_api_project.pojo;

import booking_api_project.pages.CreateBooking;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.mapper.ObjectMapperType;
import java.io.IOException;
import java.util.Properties;



public class BaseAPI {
    protected static Properties properties;
    protected static Properties dataProperties ;
    protected static Properties environmentProperties;
    public static String base_url;
    protected final int OK_STATUS_CODE = 200;
    protected String token;


   public CreateBooking createBooking =  new CreateBooking();
    protected void isSuccessfulResponse(int actualStatusCode) throws IOException {
        if (actualStatusCode != OK_STATUS_CODE) {
            throw new IOException("Request Failed with status code= " + actualStatusCode);
        }
    }

    public BaseAPI() {
        if (environmentProperties != null) {
            base_url = environmentProperties.getProperty("BASE_URL");
            RestAssured.baseURI = base_url;
            RestAssured.config = RestAssured.config()
                    .objectMapperConfig(ObjectMapperConfig.objectMapperConfig().jackson2ObjectMapperFactory(
                            (cls, charset) -> {
                                com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
                              //  objectMapper.configure(DeserializationFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
                                return objectMapper;
                            }));
        } else {
            System.err.println("Environment properties are not loaded yet!");
        }
    }
}
