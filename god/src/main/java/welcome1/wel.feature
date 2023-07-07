Feature:Login functionality of Leaftaps application



Scenario Outline: TC001_Login with positive crendital
Given open the chrome browser
And Load the application url
And Enter the username as <username>
And Enter the password as <password>
When click on Login button
Then Homepage should be displayed


Examples:
|username|password|
|'Demosalesmanager'| 'crmsfa'|
|'DemoCSR'|'crmsfa'|


