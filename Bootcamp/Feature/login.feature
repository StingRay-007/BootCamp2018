@login1
Feature: Admin login to HRM homepage
In order to login to orange HRM
As an Admin with valid username and password
I want to enter  Username, password, click on login button to access to the  Application

Scenario: Positive- Admin login successfully
Given Admin navigate to HRM login page
When Admin enter valid usrname and password
And click on login button
Then Admin will land on admin home page


