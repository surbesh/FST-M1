$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Activity1_3.feature");
formatter.feature({
  "line": 2,
  "name": "Testing with Tags",
  "description": "",
  "id": "testing-with-tags",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@activity1_3"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Test for Simple Alert",
  "description": "",
  "id": "testing-with-tags;test-for-simple-alert",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SimpleAlert"
    },
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks the Simple Alert button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Alert opens",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Read the text from it and print it",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the alert",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});