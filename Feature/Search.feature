@Search
Feature: Search Campers functionality on booking site

Scenario: Display Search results with Valid input details enter on Booking page

Given User is on Search Campers Page

When User enters input details to search Campers

Then Search is completed and the Campers search results are displayed successfully

@PriceMatchURL
Scenario: Verify the Price Match URL link

Given User is on Search Campers results Page

When User clicks on Price Match URL link

Then new page should open for Price Match URL

@SelectButton
Scenario: Click select button to select a campervan

Given User on Search Campers results Page

When User clicks on select button

Then navigate to new a page with selected campervan price details 


