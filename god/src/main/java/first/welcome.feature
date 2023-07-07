Feature: Login functionality of Leaftaps application
Background:
Given open chrome browser
Given Load application url
Scenario Outline: TC001_Login with positive Crenditals
And Enter the username as <username>  and password as <password>
When Click on Login button
Then Homepage should be displayed
Example:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|




Scenario: TC002_Login with positive Crenditals
And Enter the username as 'vvv'  and password as 'bhbbh'
Given Enter the password as crmsfa
When Click on Login button
Then Homepage should be displayed
