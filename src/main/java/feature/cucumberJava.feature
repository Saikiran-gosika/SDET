Feature: cucumberJava

Scenario: verify whether application allows Teacher to Add a new course



Given I have open the browser
Given the user launched the "http://elearning.upskills.in/index.php"
Then user login using "admin" and "admin@123"
Given Click on Create a Course link
Given Enter valid credential in Course name textbox "selenium871"
Then Click on Advanced Settings button
Then Select Valid credentials from Category list box "Projects"
Then Enter valid credential in Course code textbox "sel"
Then Select Valid credentials from Language list box "English"
Then Click on Create this course button
Then click on Add an introduction icon
Then Enter valid credentials in textbox "selenium871"
Then Click on Save intro text









