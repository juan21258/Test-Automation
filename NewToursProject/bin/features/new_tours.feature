#Author: Juan David Perez
@tag
Feature: Registration,log-in and fly check-in on new tours web page

  @registration
  Scenario Outline: User registration
    Given that dante is in the registration page
    When dante fills the required information
      | <userName> | <password> | <FirstName> | <LastName> | <Phone> | <Email> | <Address> | <Address2> | <City> | <State> | <PostalCode> | <Country> |
    Then he should see a confirmation message

    Examples: 
      | userName | password | FirstName | LastName | Phone | Email    | Address          | Address2         | City  | State       | PostalCode | Country |
      | sujeto11 | qwerty   | success   | oncelast | 26453 | sujeto11 | sujeto11 address | sujeto11 address | Paris | Paris State | l34546     | FRANCE  |

  @login
  Scenario Outline: user login
    Given that dante wants to log in to new tours
    When he enter his <user> and <password>
    Then he should see the fly selection page

    Examples: 
      | user     | password |
      | sujeto11 | qwerty   |
