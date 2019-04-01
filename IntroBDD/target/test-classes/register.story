Meta: Register Functionality

Narrative:
As a user
I want to create account
So that I have account in Linkedin


Scenario: Input All valid data in form registration
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration
And clik 'Join Now'
Then Direct to complete profile page


Scenario: Input invalid first name
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration except firstname
And clik 'Join Now'
Then Show message please enter a valid first name

Scenario: Input invalid last name
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration except lastname
And clik 'Join Now'
Then Show message please enter a valid last name


Scenario: Input invalid email
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration except email
And clik 'Join Now'
Then Show message please enter a valid email


Scenario: fill form registration with empty firstname
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration and column firstname empty
And clik 'Join Now'
Then Show message please enter firstname


Scenario: fill form registration with empty lastname
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration and column lastname empty
And clik 'Join Now'
Then Show message please enter lastname


Scenario: fill form registration with empty email/phone number
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration and column email empty
And clik 'Join Now'
Then Show message please enter email address


Scenario: fill form registration with empty password
Given Im on page https://www.linkedin.com/
When Input all valid data on form registration and column password empty
And clik 'Join Now'
Then Show message please enter password

Scenario: Button Sign Up Functionality
Given Im on page https://www.linkedin.com/
When I click button Sign Up
Then Direct to page registration new account



