$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Login Feature of SBDC Application",
  "description": "",
  "id": "login-feature-of-sbdc-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@Login"
    }
  ]
});
formatter.background({
  "line": 23,
  "name": "To launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User opens the Chrome browser",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enters the URL \"http://server:90/finsys/login.html\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationLaunch.OpenBrowser()"
});
formatter.result({
  "duration": 7176457314,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://server:90/finsys/login.html",
      "offset": 21
    }
  ],
  "location": "ApplicationLaunch.EnterURL(String)"
});
formatter.result({
  "duration": 3011280984,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Login Functionality for valid username and password",
  "description": "",
  "id": "login-feature-of-sbdc-application;login-functionality-for-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Valid-credential"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User is on the applications \"Login to SBDC\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user enters \"dummyfm\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user enters \"passw0rd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user is on the applications home page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user gets the message starting with \"Welcome\" on the top",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Login to SBDC",
      "offset": 29
    }
  ],
  "location": "LogintoSBDC.LoginPage(String)"
});
formatter.result({
  "duration": 82471217,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyfm",
      "offset": 13
    }
  ],
  "location": "LogintoSBDC.EnterUsername(String)"
});
formatter.result({
  "duration": 1134795552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd",
      "offset": 13
    }
  ],
  "location": "LogintoSBDC.EnterPassword(String)"
});
formatter.result({
  "duration": 1217576745,
  "status": "passed"
});
formatter.match({
  "location": "LogintoSBDC.ClickOnLogin()"
});
formatter.result({
  "duration": 1125875632,
  "status": "passed"
});
formatter.match({
  "location": "LogintoSBDC.VerifyHomePage()"
});
formatter.result({
  "duration": 1067220684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 37
    }
  ],
  "location": "LogintoSBDC.VerifyWelcomePage(String)"
});
formatter.result({
  "duration": 1062680017,
  "status": "passed"
});
formatter.background({
  "line": 23,
  "name": "To launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "User opens the Chrome browser",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User enters the URL \"http://server:90/finsys/login.html\"",
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationLaunch.OpenBrowser()"
});
formatter.result({
  "duration": 5300259239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://server:90/finsys/login.html",
      "offset": 21
    }
  ],
  "location": "ApplicationLaunch.EnterURL(String)"
});
formatter.result({
  "duration": 5752010606,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Login Functionality for Invalid username and password",
  "description": "",
  "id": "login-feature-of-sbdc-application;login-functionality-for-invalid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Invalid-credential"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User is on the applications \"Login to SBDC\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user enters \"dummy\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user enters \"passwd\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user is on the application Login page with Error message",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User gets the Error message \"Please Enter Valid Username or Password!!!\" at the bottom",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Login to SBDC",
      "offset": 29
    }
  ],
  "location": "LogintoSBDC.LoginPage(String)"
});
formatter.result({
  "duration": 162788534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummy",
      "offset": 13
    }
  ],
  "location": "LogintoSBDC.EnterUsername(String)"
});
formatter.result({
  "duration": 1164240231,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passwd",
      "offset": 13
    }
  ],
  "location": "LogintoSBDC.EnterPassword(String)"
});
formatter.result({
  "duration": 1370992989,
  "status": "passed"
});
formatter.match({
  "location": "LogintoSBDC.ClickOnLogin()"
});
formatter.result({
  "duration": 1236506900,
  "status": "passed"
});
formatter.match({
  "location": "LogintoSBDC.LoginPageWithError()"
});
formatter.result({
  "duration": 1050906052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please Enter Valid Username or Password!!!",
      "offset": 29
    }
  ],
  "location": "LogintoSBDC.IsAnyErrorExist(String)"
});
formatter.result({
  "duration": 1107858443,
  "status": "passed"
});
});