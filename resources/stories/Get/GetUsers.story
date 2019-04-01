Meta:

Narrative:
As a user
I want to get list Users
So I can see list data on database

Scenario: User supplies correct URI and request command list users
Given that I am ready to get command
When I input URI and request command get for list users
And click 'Send'
Then I get list data from server

Scenario: User supplies correct URI and request command single user
Given that I am ready to get command
When I input URI and request command for single user
And click 'Send'
Then I get single data from server


Scenario: User supplies correct URI and id not found
Given that I am ready to get command
When I input URI and request command with invalid id
And click 'Send'
Then I not found data from server or empty


Scenario: User supplies correct URI and request command get delayed response
Given that I am ready to get command
When I input URI and request command for get list data response
And click 'Send'
Then I get list data from server but slow response