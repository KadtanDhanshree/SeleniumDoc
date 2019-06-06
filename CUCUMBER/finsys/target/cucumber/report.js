$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureCollections/CreateCompany.feature");
formatter.feature({
  "name": "Create Company",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateComapny"
    }
  ]
});
formatter.background({
  "name": "user is successfully logged in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens the \"firefox\" browser",
  "keyword": "When "
});
formatter.match({
  "location": "login.OpenBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.LaunchApplication(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the application login page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "login.EnterUserName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "login.EnterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "login.LoginButtonClick()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.match({
  "location": "login.CheckForHomePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Company with all valid inputs",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateComapny"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "temp",
  "keyword": "Given "
});
formatter.match({
  "location": "login.delthis()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/FeatureCollections/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "user is successfully logged in",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens the \"firefox\" browser",
  "keyword": "When "
});
formatter.match({
  "location": "login.OpenBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the url \"http://localhost:90/finsys\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.LaunchApplication(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Functionality for valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@EnToEnd"
    }
  ]
});
formatter.step({
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "login.EnterUserName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "login.EnterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "login.LoginButtonClick()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the application home page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.match({
  "location": "login.CheckForHomePage(String)"
});
formatter.result({
  "status": "passed"
});
});