Feature: Account Page Feature

Background:
Given user has already logged in to application
|email|password|
|mohan1@yopmail.com|Pass@123|

Scenario: MyAccount page title
Given user is on Accounts page
When user gets the title of the page
Then page title should  be "LiveStage | MyAccount"

Scenario: MyAccount section with other module
Given user is on MyAccount page
Then user gets myaccount section
| User Details|
|Social linked accounts |
|My Payment Method |
|My Vouchers |
|Settings |
And myaccount section count should be 5
