Feature: Check the functionality of Courses dropdown on the EDUMA homepage.
Scenario: Check the Demo Accounts Page.
Given I must enter the given URL and be able to navigate to the EDUMA home page. I must also be able to hover over the Courses option in the navbar and select Demo Accounts from the dropdown menu.
Then I should by default land on the Demo Accounts page.
When I enter the given the given credentials for learner and instructor profile.
Then I should be able to log in succcessfully.
