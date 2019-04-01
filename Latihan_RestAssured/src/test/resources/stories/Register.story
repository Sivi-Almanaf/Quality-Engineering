Meta:

Narrative:
As a user
I want to register
So I can have a new account

Scenario: User supplies email and password
Given that I am on the sign-up page
When I enter my email and password correctly
And click 'Sign up'
Then My account is created

Scenario: User does NOT supply password
Given that I am on the sign-up page
When I enter my email only
And click 'Sign up'
Then I see an error message 'missing password'