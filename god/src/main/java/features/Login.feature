Feature: Login functionality of Leaftaps application
Scenario: TC001_Login with positive Crenditals
Given open chrome browser
Given Load application url
Given Enter the username as DemosalesManager
Given Enter the password as crmsfa
When Click on Login button
Then Homepage should be displayed
