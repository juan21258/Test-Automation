#Author: Juan David Perez
@tag
Feature: Travel Reservation
  I want to make a reservation for a travel

  @TravelSelection
  Scenario Outline: Choose Trip
    Given That dante is in the flights page
    And He selects the <origin city>,<destination city>,<departureDay>,<departureMonth>,<departureYear> and number of <adults>,<kids> and <infants>
    When Dante choose the <flightoption>
    Then He should get a ticket confirmation

    Examples: 
      | origin city | destination city | departureDay | departureMonth | departureYear | adults | kids | infants | flightoption |
      | Medellin    | Praga            |           19 | Noviembre      |          2018 |      1 |    1 |       1 |            7 |
