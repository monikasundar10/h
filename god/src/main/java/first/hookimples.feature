Feature:Login functionality of Leaftaps application
Scenario Outline:TC001_Login with positive crendital
Given Enter the username as <username>
And Enter the password as <password>
When click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|


Scenario: TC002_Login with negative crendital
Given Enter the username as 'aaa'
And Enter the password as 'crmsfa'
When click on Login button
But Error  message should be displayed