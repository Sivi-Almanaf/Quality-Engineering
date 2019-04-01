Meta:

Narrative:
As a user
I want to sign in
So I can see my marketing campaigns

Scenario: User supplies correct username and password
Given that I am on the sign-in page
When I enter my email and password correctly
And click 'Sign in'
Then I am taken to the dashboard

Scenario: User does NOT supply correct username and password
Given that I am on the sign-in page
When I enter my email only
And click 'Sign in'
Then I see an error message 'missing password'