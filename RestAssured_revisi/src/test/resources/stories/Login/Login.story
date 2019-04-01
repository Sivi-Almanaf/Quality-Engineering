Meta: Login Functionality

Narrative:
As a user
I want to sign in
So I can see my marketing campaigns

Scenario: User supplies correct user name and password
Given that I am on the sign-in page login
When I will login with enter valid my email and password correctly
And click 'Sign In'
Then I am taken to the dashboard after login

Scenario: User does NOT supply correct user name and password
Given that I am on the sign-in page login
When I will login with enter my email only
And click 'Sign In'
Then I see an error message 'Missing password' after Login
