#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Login
Feature: Login Feature of SBDC Application

Background: To launch the application
When User opens the Chrome browser
And User enters the URL "http://server:90/finsys/login.html"

 @Valid-credential
  Scenario: Login Functionality for valid username and password
    Given User is on the applications "Login to SBDC" page
    When user enters "dummyfm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the applications home page
    And user gets the message starting with "Welcome" on the top

 @Invalid-credential
  Scenario: Login Functionality for Invalid username and password
    Given User is on the applications "Login to SBDC" page
    When user enters "dummy" as username
    And user enters "passwd" as password
    And user clicks on login button
    Then user is on the application Login page with Error message
    And User gets the Error message "Please Enter Valid Username or Password!!!" at the bottom

 