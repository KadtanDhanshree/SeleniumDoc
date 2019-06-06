#StyoryType=WEB
#Owner=DD
#CreationDate=26-11-2018 Monday
@Login
Feature: Login Feature
Description: This feature test Login functionality.
  Background:user has successfully logged in
	  When user opens the "firefox" browser
	  And user enter the url "http://localhost:90/finsys"

  @HappyPath
  Scenario: Login Functionality for valid username and password
		Given user is on the application login page
    When user enters "dummyfm" as username
    	And user enters "passw0rd" as password
    	And user clicks on login button
    Then user is on the application home page
    	And user gets "Welcome dummy[FM]" message

  @ValidUserInvalidPswd
  Scenario: Login Functionality for valid username and invalid password
	Given user is on the application login page
	When user enters "dummyfm" as username
	And user enters "password" as password
	And user clicks on login button
	Then user gets "Please Enter Valid Username or Password!!!" message


  @InvalidUserValidPswd
  Scenario: Login Functionality for invalid username and valid password
	Given user is on the application login page
	When user enters "dummyfmf" as username
	And user enters "passw0rd" as password
	And user clicks on login button
	Then user gets "Please Enter Valid Username or Password!!!" message

  
  @BlankUserAndPswd
  Scenario: Login Functionality for blank username and  password
	Given user is on the application login page
	When user enters "" as username
	And user enters "" as password
	And user clicks on login button
	Then user gets "Please Enter Valid Username or Password!!!" message

 
  @SpclChrUserAndPswd
  Scenario: Login Functionality by passing special characters in username and invalid password
	Given user is on the application login page
	When user enters "$dummyfm%" as username
	And user enters "p@ssword*" as password
	And user clicks on login button
	Then user gets "Please Enter Valid Username or Password!!!" message