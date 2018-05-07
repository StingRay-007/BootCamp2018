@login2
Feature: Adminlogin to HRM homepage
In order to login to orange HRM
As an Admin with valid username and password
I want to enter  Username, password, click on login button to access to the  Application


Scenario: Positive - Admin login successfully
Given Admin navigate to HRM loginpage
When Admin enter validusrname and password
And click on loginbutton
Then Admin will land on admin homepage


