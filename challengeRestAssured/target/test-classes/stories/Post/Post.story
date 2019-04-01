Meta: Post Functionality

Narrative:
As a user
I want to Add data
So I can see additional data for pet store





!-- Updates a pet in the store with form data
Scenario: User supplies correct data to update a pet with form data
Given that I am ready to Admin page
When I will post data with fill the data with invalid input in form data
Then I got response invalid input data in form data




!-- upload an image
Scenario: User will upload image from their page
Given that I am ready to Admin page
When I will post data for upload image with iput id pet
Then I'm succesful upload image to my pet store


!-- Place an order for a pet
Scenario: User will place an order for a pet
Given that I am ready to Admin page
When I will post data for place an order for a pet in pet store
Then I'm succesful order a pet in pet store


!-- create user
Scenario: User will create new user
Given that I am ready to Admin page
When I will post for create user with valid input data
Then I'm succesful create user to petstore


!-- Creates list of users with given input array
Scenario: User will create new user with given input array
Given that I am ready to Admin page
When I will post for create user given input array with valid input data
Then I'm succesful create list user to petstore with given input array

!-- Creates list of users with given input array
Scenario: User will create list with given input array whitelist
Given that I am ready to Admin page
When I will post for create user given input array with whitelist
Then I'm succesful create list user to whitelist petstore with given input array








