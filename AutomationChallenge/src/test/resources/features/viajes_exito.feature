#Author: Juan David Perez
@tag
Feature: Travel Reservation
  I want to make a reservation for a travel

  @TravelSelection
  Scenario Outline: Choose Trip
    Given That dante is in the flights page
    And He selects the <origin city>,<destination city>,<departure> and number of <adults>,<kids> and <infants>
    When Dante choose the <flightoption>
    Then He should get a ticket confirmation

    Examples: 
      | origin city | destination city | departure  | adults | kids | infants | flightoption |
      | Medellin    | Praga            | 13-11-2018 |      1 |    0 |       0 |            4 |
