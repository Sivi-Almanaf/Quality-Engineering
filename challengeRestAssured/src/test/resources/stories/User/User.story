Meta: User

Narrative:
As a user
I want to login to my account
So I can see monitoring my account

Scenario: User will create new user
Given that I am ready to Admin page
When I will post for create user with valid input data
Then I'm succesful create user to petstore


!-- Logs user into the system
Scenario: User will Login valid data
Given that I am ready to Admin page
When I will login to my pet store with valid data
Then I taken to dashboard homepage

Scenario: Get user by valid user name
Given that I am ready to Admin page for get
When I will Get user by valid user name
Then I got user by valid user name
