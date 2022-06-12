Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "LiveStage | Login"

Scenario: Forget Password Link
Given user is on login page
Then forgot password Link should be display

Scenario: Login with correct credentails 
Given user is on login page
When user enters username "mohan1@yopmail.com"
And user enters password "Pass@123"
And user clicks on cookies button
And user clicks on Login button
Then user gets the title of the page
And page title should be "LiveStage | Login"