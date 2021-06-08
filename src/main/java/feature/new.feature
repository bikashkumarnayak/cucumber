
Feature:Airface verify

Scenario Outline:create a new employee and check employee is added or not


Given lunch browser
When login "<username>" and "<password>" click admin and login button
Then clicked toggle and employee and addEmployee button
Then Enter the data "<employeeID>" and "<name>" and "<email>" and "<Phonenumber>" and location save the employee
Then Verify employee is added or not



Examples:
         | username | password | employeeID | name | email | Phonenumber |
         | kumarnayak9178@gmail.com | Bikash07@ | IN_OD_17 | nena agrawal | nenaag@gmail.com | 8984564526 |
