Meta:

Narrative:
As a Admin user
I want to check some feature
so that I can take conclusion as coreectly

Scenario: User supplies correct data for Create data
Given that I am on page admin
When I will post with enter name, and jobs correctly
And click button 'Send'
Then I have update database with post and get new id



Scenario: User supplies correct data for update data with put
Given that I am on page admin
When I will put with enter name, and jobs correctly
And click button 'Send'
Then I have update database with put


Scenario: User supplies correct data for update data with patch
Given that I am on page admin
When I will patch with enter name, and jobs correctly
And click 'Send'
Then I have update database with patch


Scenario: User supplies correct URI and request command single user
Given that I am on page admin
When I input URI and request command for single user
And click button 'Send'
Then I get single data from server


Scenario: User supplies correct URI and request delete for single users
Given that I am on page admin
When I will delete a data from database
And click button 'Send'
Then Im succesfully delete data and show data is deleted



