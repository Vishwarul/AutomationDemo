Feature: Check the functionality of Courses dropdown on the EDUMA homepage.
Scenario: Check the Other Free Type option.
Given I launch Chrome browser and open EDUMA Homepage
Given I click on Courses drop down.
When I click on the Courses dropdown i should be able to see Other Free Type.
And I click on Other Free Type 
Then I should land on the Techonology page.
And I should be able to see Teacher, Categories and Review.
And I also be able to see Description, Curriculum, Instructors and Review relating to the course.
And I should see You May Like section.
And I should be able to see links to All Courses, Latest Courses and an advertisement.

