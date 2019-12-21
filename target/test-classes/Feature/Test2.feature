Feature: Check the functionality of Courses dropdown on the EDUMA homepage.
Scenario: Check the Other Paid Type option.
Given I navigate to the EDUMA home page.
When I hover on the Courses dropdown I should be able to see Other Paid Type.
When I click on Other Paid Type 
Then I should land on the Techonology page once again.
Then Below the course title I should be able to see Teacher, Categories, Reviews, Course Fee and Buy This Course options.
Then I should also be able to see Description, Curriculum, Instructor and Reviews relating to the course.
Then On the right side of the page I should be able to see links to All Courses, Latest Courses and an advertisement.
