#Author: 
#Created By:
#Created Date:
#Reviewed By:
#Reviewed Date:
#Parameters:
#Purpose:
#Descriptions:
Feature: Login and logout functionality
Description: Login and Logout functionality validation

Scenario: Login with valid credentails
Given I launch the firefox browser
And I navigate the Application URL
When I enter the valid UserName
And I enter valid password
And I click on Login button
Then I found a home page

Scenario: Logout functionality
When I click on Logout link
Then I found Login Page

