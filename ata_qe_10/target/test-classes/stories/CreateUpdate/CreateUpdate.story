Meta:

Narrative:
As a user
I want to create or update data
So I can have new data

Scenario: User supplies correct data for Post data
Given that I am on page admin
When I enter name, and jobs correctly
And click 'Send'
Then I have update database with post and new id


Scenario: User supplies correct data for Put data
Given that I am on page admin
When I enter name, and jobs correctly for put update
And click 'Send'
Then I have update database with put


Scenario: User supplies correct data for Patch data
Given that I am on page admin
When I enter name, and jobs correctly for pacth update
And click 'Send'
Then I have update database with patch