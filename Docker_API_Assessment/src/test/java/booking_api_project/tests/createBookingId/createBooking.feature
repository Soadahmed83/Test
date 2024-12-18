Feature: Create Booking API

  Scenario Outline: Successfully create a new booking
    Given I want to create booking with valid  firstName "<firstName>" and lastName "<lastName>" and depositPaid "<depositPaid>" and totalPrice "<totalPrice>" checkInDate "<dateCheckIn>" and checkOutDate "<dateCheckOut>" and additionalNeeds "<additionalNeeds>"
    Then the response should have a status code of 200
    And the response should contain a booking ID

    Examples:
    |firstName|lastName|depositPaid|totalPrice|dateCheckIn|dateCheckOut|additionalNeeds|
    |firstName|lastName|depositPaid|totalPrice|checkIn|checkOut|additionalNeeds|