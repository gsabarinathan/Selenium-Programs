Feature: Login to Leafttaps application
Scenario: TC001 positive flow for login
Given Launch the browser
And Maximize the browser
And Load the URL
And Enter the username as demosalesmanager
And Enter the password as crmsfa
And Click on the login button
And Click on crmsfa button
And Click on the leads tab
And Click on Create Lead tab
And Enter Company Name as RNTBCI
And Enter First Name as Renault
And Enter Last Name as Nissan
When Click on Create lead button
Then Verify Lead is successfully created