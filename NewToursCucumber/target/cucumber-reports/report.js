$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/NewTours.feature");
formatter.feature({
  "name": "Sign in New Tours webpage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "New Tours Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@regularlogin"
    }
  ]
});
formatter.step({
  "name": "The tours page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs_NewTours.the_tours_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type the user and password information",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs_NewTours.i_type_the_user_and_password_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_NewTours.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It shows a new page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_NewTours.it_shows_a_new_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/loginparameters.feature");
formatter.feature({
  "name": "Accessing NewTours",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login to NewTours",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "I open my application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs_Login.i_open_my_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login with following credentials",
  "rows": [
    {
      "cells": [
        "Karolina",
        "ace"
      ]
    },
    {
      "cells": [
        "Maria",
        "qwerty"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs_Login.i_login_with_following_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
});