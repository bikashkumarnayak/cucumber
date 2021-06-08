Feature: AirfaceOfficePro Login Feature
#with out example keyword
#Scenario:AirfaceOfficePro login scenario

#Given User already given page
#When verify log in page
#Then user enter "kumarnayak9178@gmail.com" and "Bikash07@" and Admin and loginButton
#Then verify dashboard




#with example keyword
Scenario Outline:AirfaceOfficePro login scenario

Given User already given page
When verify log in page
Then user enter "<username>" and "<password>" and Admin and loginButton
Then verify dashboard
Then close the browser

Examples:
         | username | password |
         | kumarnayak9178@gmail.com | 1234 |
         | kumarnayak9178@gmail.com | Bikash07@ |