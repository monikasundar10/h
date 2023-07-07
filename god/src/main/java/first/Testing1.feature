Feature:Login functionality of Leaftaps application

Background:
Given open the chrome browser
And Load the application url

@functional @regression
Scenario Outline: TC001_Login with positive crendital
Given Enter the username as <username> 
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|


@regression
Scenario: TC002_Login with negative crendital
Given Enter the username as 'DemoCSR vdvvfv'
And Enter the password as 'crmsvvfafrffrf'
When Click on Login button
But Error should be displayed


@functional
Scenario: TC002_Login with negative crendital
Given Enter the username as 'DemoCSR vdvvfv'
And Enter the password as 'crmsvvfafrffrf'
When Click on Login button
But Error should be displayed





