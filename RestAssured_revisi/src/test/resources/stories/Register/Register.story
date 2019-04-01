Meta: Register Functionality

Narrative:
As a user
I want to sign up
So I can have account

Scenario: User supplies correct data for register
Given that I am on the sign-up page for register
When I will register with enter name, my email and password correctly
And click 'Sign Up'
Then I am taken to the Register page

Scenario: User does NOT supply correct data for register
Given that I am on the sign-up page for register
When I will register with enter name, my email only and password empty
And click 'Sign Up'
Then Show an error message 'Please Enter password'