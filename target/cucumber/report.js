$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('feature\cucumberJava.feature');
formatter.feature({
  "line": 1,
  "name": "cucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "verify whether application allows Teacher to Add a new course",
  "description": "",
  "id": "cucumberjava;verify-whether-application-allows-teacher-to-add-a-new-course",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user launched the \"http://elearning.upskills.in/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user login using \"admin\" and \"admin@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Create a Course link",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Enter valid credential in Course name textbox \"selenium\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Click on Advanced Settings button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Select Valid credentials from Category list box \"Projects\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter valid credential in Course code textbox \"sel\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Select Valid credentials from Language list box \"English\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on Create this course button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on Add an introduction icon",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Enter valid credentials in textbox \"this is an selenium course\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click on Save intro text",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberJava.openBrowser()"
});
formatter.result({
  "duration": 10561245800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://elearning.upskills.in/index.php",
      "offset": 23
    }
  ],
  "location": "CucumberJava.the_user_launched_the(String)"
});
formatter.result({
  "duration": 24988589200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 18
    },
    {
      "val": "admin@123",
      "offset": 30
    }
  ],
  "location": "CucumberJava.user_login_using_admin_and_admin_(String,String)"
});
formatter.result({
  "duration": 14430356700,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.Click_on_Create_a_Course_link()"
});
formatter.result({
  "duration": 2668236700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 47
    }
  ],
  "location": "CucumberJava.Enter_valid_credential_in_Course_name_textbox(String)"
});
formatter.result({
  "duration": 340468600,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.Click_on_Advanced_Settings_button()"
});
formatter.result({
  "duration": 55700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Projects",
      "offset": 49
    }
  ],
  "location": "CucumberJava.Select_Valid_credentials_from_Category_list_box(String)"
});
formatter.result({
  "duration": 162400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sel",
      "offset": 47
    }
  ],
  "location": "CucumberJava.Enter_valid_credential_in_Course_code_textbox(String)"
});
formatter.result({
  "duration": 123500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 49
    }
  ],
  "location": "CucumberJava.Select_Valid_credentials_from_Language_list_box(String)"
});
formatter.result({
  "duration": 107400,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.Click_on_Create_this_course_button()"
});
formatter.result({
  "duration": 71900,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.click_on_Add_an_introduction_icon()"
});
formatter.result({
  "duration": 75000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "this is an selenium course",
      "offset": 36
    }
  ],
  "location": "CucumberJava.Enter_valid_credentials_in_textbox(String)"
});
formatter.result({
  "duration": 160600,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.Click_on_Save_intro_text()"
});
formatter.result({
  "duration": 58300,
  "status": "passed"
});
});