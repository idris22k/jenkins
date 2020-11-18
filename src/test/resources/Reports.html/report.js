$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "verifying adactinhotelapp details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying adactinhotelapp details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the adactinhotelapp login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I should enter invalid \"\u003cuserName\u003e\" and \"\u003cpassWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should serach hotel  using \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomType\u003e\",\"\u003cnoofRooms\u003e\",\"\u003ccheckinDate\u003e\",\"\u003ccheckoutDate\u003e\",\"\u003cadultsPerRooms\u003e\",\"\u003cchildPerRooms\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I should select Hotel",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord",
        "location",
        "hotel",
        "roomType",
        "noofRooms",
        "checkinDate",
        "checkoutDate",
        "adultsPerRooms",
        "childPerRooms"
      ]
    },
    {
      "cells": [
        "idris1997k",
        "2323233333",
        "Sydney",
        "Hotel Creek",
        "Super Deluxe",
        "2",
        "28/10/2020",
        "28/10/2020",
        "3 - Three",
        "3 - Three"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying adactinhotelapp details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the adactinhotelapp login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.i_am_on_the_adactinhotelapp_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should enter invalid \"idris1997k\" and \"2323233333\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.i_should_enter_invalid_and(String,String)"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c...Password might have []. Click here to rese...\u003e but was:\u003c...Password might have [expired]. Click here to rese...\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.pages.LoginPage.login(LoginPage.java:50)\r\n\tat com.stepdefination.LoginPageSteps.i_should_enter_invalid_and(LoginPageSteps.java:34)\r\n\tat ✽.I should enter invalid \"idris1997k\" and \"2323233333\"(src/test/resources/Features/LoginPage.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should serach hotel  using \"Sydney\",\"Hotel Creek\",\"Super Deluxe\",\"2\",\"28/10/2020\",\"28/10/2020\",\"3 - Three\",\"3 - Three\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.userShouldSerachHotelUsingSuperDeluxe(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should select Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.i_should_select_Hotel()"
});
formatter.result({
  "status": "skipped"
});
});