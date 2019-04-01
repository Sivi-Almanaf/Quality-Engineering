Meta:

Narrative:
As a user
I want to perform profile page
So that I can see my profile

Scenario: Scenario Open Profile Success
GivenStories: stories/login.story#{Login:Success}
When I click button notification
Then I got to my list notification