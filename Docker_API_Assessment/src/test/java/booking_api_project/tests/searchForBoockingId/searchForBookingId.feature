Feature: searchForBookingId

Feature: search For Specific Booking Id

  Scenario Outline: Retrieve an existing booking by ID
    Given I retrieve the booking with ID <bookingIdNumber>
    Then the booking details should have firstName "<firstName>" and lastName "<lastName>"

    Examples:
      | bookingIdNumber | firstName            | lastName             |
      | 1               | booking.1.firstName  | booking.1.lastName   |
