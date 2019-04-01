Meta:

Narrative:
As a user
I want to get list Users
So I can see list data on database

Scenario: User supplies correct URI and request command get list users
Given that I am ready to get command users
When I will get with input URI and request command get for list users
And click 'Send'
Then I got list data from server

Scenario: User supplies correct URI and id not found
Given that I am ready to get command users
When I will get with input URI and request command with invalid id
And click 'Send'
Then I not found data from server or empty

Scenario: User supplies correct URI and request command list user unknown
Given that I am ready to get command users
When I input URI and request command for list users unknown
And click 'Send'
Then I get list random data from server

Scenario: User supplies correct URI and request command single user unknown
Given that I am ready to get command users
When I input URI and request command for single user unknown
And click 'Send'
Then I got single random data from server


Scenario: User supplies correct URI and request command unknown single user
Given that I am ready to get command users
When I input URI and request command for single user unknown and not found data
And click 'Send'
Then I'm not found any random data from server


Scenario: User supplies correct URI and request command get delayed response
Given that I am ready to get command users
When I input URI and request command for get list data response delayed
And click 'Send'
Then I get list data from server but slow response



