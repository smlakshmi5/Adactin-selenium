
Feature: I want to login AdactinHotelApp
Scenario: Valid Credential details

Given  User launching the url and maximize
When I enter the valid username
And I enter the password
Then I click on the login button
When Select hotel location
And Select the hotel
And Selet room type
Then Select number of rooms
And select checkin date
And Selet checkout date
Then Select room for adults
And Select room for kids
Then I click on search button

