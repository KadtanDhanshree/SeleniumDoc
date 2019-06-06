#StyoryType=WEB
#Owner=DD
#CreationDate=26-11-2018 Monday
@CreateCompany
Feature: Create Company Feature

Background: user has successfully logged in
   	When user opens the "firefox" browser
  		And user enter the url "http://localhost:90/finsys"
		Given user is on the application login page
    When user enters "dummyfm" as username
    	And user enters "passw0rd" as password
    	And user clicks on login button
    Then user is on the application home page
    	And user gets "Welcome dummy[FM]" message
  
	
	@HappyPath @CreateCompanyHappyPath
	Scenario: Create Company finctionality
		Given user is on "Welcome page" of the application
		When user clicks on Manage Company link
			Then application adds new tab as "Manage Company" in Main Activity
				And application displays "Company" table
		
		When user clicks on New link in Company table

		When user enters "TCS" as COMPNAY_NAME
			And user enters "IT" as COMPNAY_TYPE
			And user enters "INDIA" as COUNTRY
			And user enters "MAHARASTRA" as STATE
			And user enters "PUNE" as CITY
			And user enters "abc@ejagruti.com" as EMAIL
			And user enters "ABCYZ1234A" as PAN
			And user enters "XYZAB9876Z" as TIN
			And user clicks on Save button
				Then application display the new record by name as "TSC" in first row of the table
					
	@CreateCompanyWithDuplicateName
	Scenario: Login Functionality for valid username and invalid password
		Given user is on "Welcome page" of the application
		When user clicks on Manage Company link
			Then application adds new tab as "Manage Company" in Main Activity
			And application displays "Company" table
		
		When user click on New link in Company table
		Then below the last row of the table, Company Name, Company Type, Email, PAN Details, Tin Details, Country, State, City Name these mandatory fields gets appeared

		When user enters "TCS" as COMPNAY_NAME, here "TCS" is already existing company. 
			And user enters "IT" as COMPNAY_TYPE
			And user enters "INDIA" as COUNTRY
			And user enters "MAHARASTRA" as STATE
			And user enters "PUNE" as CITY
			And user enters "abc@ejagruti.com" as EMAIL
			And user enters "ABCYZ1234A" as PAN
			And user enters "XYZAB9876Z" as TIN
			And user clicks on Save button
				Then user gets "Company Already Exists.Please Select different Company Name!!!" message
		
	@CreateCompanyWithoutName
	Scenario: Login Functionality for valid username and invalid password
		Given user is on "Welcome page" of the application
		When user clicks on Manage Company link
			And user click on New link in Company table
			And user enters "" as COMPNAY_NAME
			And user enters "IT" as COMPNAY_TYPE
			And user enters "INDIA" as COUNTRY
			And user enters "MAHARASTRA" as STATE
			And user enters "PUNE" as CITY
			And user enters "abc@ejagruti.com" as EMAIL
			And user enters "ABCYZ1234A" as PAN
			And user enters "XYZAB9876Z" as TIN
			And user clicks on Save button
				Then application popups up message as "This field is required."
		
	@CreateCompanyWithSpecialCharName
	Scenario: Login Functionality for valid username and invalid password
		Given user is on "Welcome page" of the application
		When user clicks on Manage Company link
			And user click on New link in Company table
			And user enters "TCS$##" as COMPNAY_NAME
			And user enters "IT" as COMPNAY_TYPE
			And user enters "INDIA" as COUNTRY
			And user enters "MAHARASTRA" as STATE
			And user enters "PUNE" as CITY
			And user enters "abc@ejagruti.com" as EMAIL
			And user enters "ABCYZ1234A" as PAN
			And user enters "XYZAB9876Z" as TIN
			And user clicks on Save button
				Then application display the new record by name as "TCS$##" in first row of the table
		
	@EditExistingCompanyRecord
	Scenario: Login Functionality for valid username and invalid password
		Given user is on "Manage Company" tab of the application
		When user clicks on + link of "TCS$##" record
			Then application displays all the data of the record to edit
		
		When user enters "TCS_Mdfy" as COMPNAY_NAME
			And user clicks on Save button
			Then application display the modified record by name as "TCS_Mdfy" in first row of the table