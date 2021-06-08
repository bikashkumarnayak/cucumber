$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/com.BDDFramework/src/main/java/feature/new.feature");
formatter.feature({
  "line": 2,
  "name": "Airface verify",
  "description": "",
  "id": "airface-verify",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "create a new employee and check employee is added or not",
  "description": "",
  "id": "airface-verify;create-a-new-employee-and-check-employee-is-added-or-not",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "lunch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" click admin and login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clicked toggle and employee and addEmployee button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the data \"\u003cemployeeID\u003e\" and \"\u003cname\u003e\" and \"\u003cemail\u003e\" and \"\u003cPhonenumber\u003e\" and location save the employee",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify employee is added or not",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "airface-verify;create-a-new-employee-and-check-employee-is-added-or-not;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "employeeID",
        "name",
        "email",
        "Phonenumber"
      ],
      "line": 16,
      "id": "airface-verify;create-a-new-employee-and-check-employee-is-added-or-not;;1"
    },
    {
      "cells": [
        "kumarnayak9178@gmail.com",
        "Bikash07@",
        "IN_OD_17",
        "nena agrawal",
        "nenaag@gmail.com",
        "8984564526"
      ],
      "line": 17,
      "id": "airface-verify;create-a-new-employee-and-check-employee-is-added-or-not;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "create a new employee and check employee is added or not",
  "description": "",
  "id": "airface-verify;create-a-new-employee-and-check-employee-is-added-or-not;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "lunch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "login \"kumarnayak9178@gmail.com\" and \"Bikash07@\" click admin and login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clicked toggle and employee and addEmployee button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the data \"IN_OD_17\" and \"nena agrawal\" and \"nenaag@gmail.com\" and \"8984564526\" and location save the employee",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify employee is added or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Addemp.lunch_browser()"
});
formatter.result({
  "duration": 5331430499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kumarnayak9178@gmail.com",
      "offset": 7
    },
    {
      "val": "Bikash07@",
      "offset": 38
    }
  ],
  "location": "Addemp.login_and_click_admin_and_login_button(String,String)"
});
formatter.result({
  "duration": 2085703200,
  "status": "passed"
});
formatter.match({
  "location": "Addemp.clicked_toggle_and_employee_and_addEmployee_button()"
});
formatter.result({
  "duration": 7807005901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IN_OD_17",
      "offset": 16
    },
    {
      "val": "nena agrawal",
      "offset": 31
    },
    {
      "val": "nenaag@gmail.com",
      "offset": 50
    },
    {
      "val": "8984564526",
      "offset": 73
    }
  ],
  "location": "Addemp.enter_the_data_and_and_and_and_location_save_the_employee(String,String,String,String)"
});
formatter.result({
  "duration": 2129382400,
  "status": "passed"
});
formatter.match({
  "location": "Addemp.verify_employee_is_added_or_not()"
});
formatter.result({
  "duration": 5112859800,
  "status": "passed"
});
});