Meta: Put Functionality

Narrative:
As a user
I want to update data
So I could see changed data for pet store


!-- Update an existing pet


Scenario: User will Update with existing pet invalid id
Given that I am ready to Admin page for update
When I will put data with fill the invalid data
Then show message error cannot update with invalid id


Scenario: User will Update with existing pet that not found
Given that I am ready to Admin page for update
When I will put data with pet not found
Then show message error cannot update pet not found

Scenario: User will Update existing pet with validation exception
Given that I am ready to Admin page for update
When I will put data with pet not found
Then show message validation exception


!-- Updated user
Scenario: User will Updated user valid data username
Given that I am ready to Admin page for update
When I will put data for update valid data username
Then I taken to dashboard and show valid data username

Scenario: User will Update with user invalid data username
Given that I am ready to Admin page for update
When I will put data with fill the invalid data username
Then show message error cannot update with invalid id username


Scenario: User will Update with data username not found
Given that I am ready to Admin page for update
When I will put data with pet not found username
Then show message error cannot update pet not found username



