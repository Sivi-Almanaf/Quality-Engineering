Meta: Pet

Narrative:
As a user
I want to Add, Update, Get and Delete
So I can see monitoring system


!-- Add a new pet to the store
Scenario: User supplies correct data to add a pet
Given that I am ready to pet page
When I will post data with fill the data as correctly
Then I taken to dashboard new data added

!-- Update an existing pet
Scenario: User will Update an existing pet
Given that I am ready to pet page
When I will put data with fill the data as correctly
Then I taken to dashboard and show update pet


Scenario: User will find pet by valid ID
Given that I am ready to pet page
When I will find pets by valid ID
Then I taken to dashboard show status pet by valid ID


!-- Deletes a pet
Scenario: User Deletes a pet by valid id
Given that I am ready to pet page
When I will delete data as correctly
Then I taken to dashboard data deleted