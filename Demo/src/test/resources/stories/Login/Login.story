Meta:

Narrative:
As a user
I want to sign in
So I can see my marketing campaigns

Scenario: User supplies correct user name and password
Given that I am on the sign-in page
When I enter my email and password correctly
And click 'Sign In'
Then I am taken to the dashboard

Scenario: User does NOT supply correct user name and password
Given that I am on the sign-in page
When I enter my email only
And click 'Sign In'
Then I see an error message 'Missing password'