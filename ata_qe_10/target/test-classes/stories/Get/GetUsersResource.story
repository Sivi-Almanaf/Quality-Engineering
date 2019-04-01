Meta:

Narrative:
As a user
I want to get random Users
So I can see data on database

Scenario: User supplies correct URI and request command list user unknown
Given that I am ready to get command
When I input URI and request command for list user unknown
And click 'Send'
Then I get list random data from server

Scenario: User supplies correct URI and request command single user unknown
Given that I am ready to get command
When I input URI and request command for single user unknown
And click 'Send'
Then I get single random data from server


Scenario: User supplies correct URI and request command unknown single user
Given that I am ready to get command
When I input URI and request command for single user unknown and not found data
And click 'Send'
Then I'm not found any data from server