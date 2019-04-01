Meta: Delete Functionality

Narrative:
As a user
I want to Add data
So I can see additional data for pet store


!-- Deletes a pet


Scenario: User Deletes a pet by invalid id
Given that I am ready to Admin page for delete
When I will delete data invalid id
Then Show message invalid id to delete

Scenario: User Deletes a pet not found
Given that I am ready to Admin page for delete
When I will delete a data that not found
Then Show message pet not found to delete


!-- Delete purchase order by ID
Scenario: User Deletes a purchase order by invalid ID
Given that I am ready to Admin page for delete
When I will delete purchase order by ID
Then Show message invalid id to delete from order


Scenario: User Deletes a purchase order not found
Given that I am ready to Admin page for delete
When I will delete purchase order not found
Then Show message order not found to delete


!-- Delete user
Scenario: User Delete a user from database by invalid ID
Given that I am ready to Admin page for delete
When I will delete user from database by invalid ID
Then Show message invalid user to delete

Scenario: User Delete a user not found from database
Given that I am ready to Admin page for delete
When I will delete user not found from database
Then Show message user not found to delete