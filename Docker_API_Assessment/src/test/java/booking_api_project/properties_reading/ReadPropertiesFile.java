package booking_api_project.properties_reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    private static final String bookingDataConfigPath = "./resources/config/booking_config.properties";
    private static final String bookingURLPath = "./resources/config/config-URL.properties";

    public static Properties getBookingDataProperties() {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(bookingDataConfigPath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("Error loading booking data properties file: " + bookingDataConfigPath);
            e.printStackTrace();
        }
        return properties;
    }

    public static Properties getBookingURLProperties() {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(bookingURLPath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("Error loading booking URL properties file: " + bookingURLPath);
            e.printStackTrace();
        }
        return properties;
    }
}
