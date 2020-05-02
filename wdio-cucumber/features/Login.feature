Feature: Performing a login

   Background: User is in the web page
        Given I'm on the login page
    Scenario: Login witg a default user
        When I log in with a default user
        Then I shall be on the Flight Finder page