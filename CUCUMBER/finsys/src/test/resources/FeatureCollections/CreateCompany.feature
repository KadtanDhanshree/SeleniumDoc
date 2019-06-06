#StyoryType=WEB
#Owner=ejagruti
#CreationDate=24-12-2017 Sunday
@CreateComapny
Feature: Create Company
 Background: user is successfully logged in
  	When user opens the "firefox" browser
  	And user enter the url "http://localhost:90/finsys"
  	Then user is on the application login page
    When user enters "dummyfm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    And user gets the message starting with "Welcome" on the top

    
@SmokeTest @RegressionTest
 Scenario: Create Company with all valid inputs
 	Given temp
@EndToEndTest
 Scenario: Create Company with blank inputs
 
 @EndToEndTest
 Scenario: Create Company with partial valid & partial invalid inputs
 
 @EndToEndTest
 Scenario: Create Company by passing only mandatory details
 
 