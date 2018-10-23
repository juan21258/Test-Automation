#Author: your.email@your.domain.com

Feature: Google Translate
  As a web user
  I want to use google translate
  To translate words between different languages

  Scenario: Translate from English to Spanish
    Given that susan wants to translate a word
    When she translates the word cheese from English to Spanish
    Then she should see the word queso on the screen
