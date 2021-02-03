Feature: Leaftaps login functionality 

#Background:
#Given Launch the chrome browser
#And Load the application url

Scenario Outline: TC001_Login using positive credential
Given Enter the username as <username>
And Enter the password  as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


Scenario: TC002_Login using negative credential
Given Enter the username as 'Demosalesmanager'
And Enter the password  as 'crmsfa123'
When Click on login button
But Error message should be displayed


