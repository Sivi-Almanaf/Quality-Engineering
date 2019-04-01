Meta: Register Functionality

Narrative:
As a user
I want to login
So that I can see my profil on Linkedin


Scenario: Input All valid data on form sign in
Given registered account on page https://www.linkedin.com/
When Input valid email registered, valid password
And clik 'Sign In'
Then Direct to Homepage linkedin


Scenario: Input valid email, wrong password
Given registered account on page https://www.linkedin.com/
When Input valid email registered, Invalid password
And clik 'Sign In'
Then Show Message please enter valid password


Scenario: Input Invalid email
Given registered account on page https://www.linkedin.com/
When Input Invalid email registered, and valid password
And clik 'Sign In'
Then Show Message please enter valid email



Scenario: Input valid email, empty password
Given registered account on page https://www.linkedin.com/
When Input valid email registered, empty password
And clik 'Sign In'
Then Show Message please enter password


Scenario: Input just valid password
Given registered account on page https://www.linkedin.com/
When empty email/phone number and input valid password
And clik 'Sign In'
Then Show Message please enter email/phone number


Scenario: forgot password functionality
Given registered account on page https://www.linkedin.com/
When Click button 'forgot password'
Then Direct to page request password reset





