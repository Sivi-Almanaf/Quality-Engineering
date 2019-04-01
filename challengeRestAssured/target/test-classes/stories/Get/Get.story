Meta: Get Functionality

Narrative:
As a user
I want to Get information data
So I can see information in pet store about pets


!-- Finds Pets by status

Scenario: User will find status pending from pets
Given that I am ready to Admin page for get
When I will find pets by pending status
Then I taken to dashboard show pending status pets

Scenario: User will find status sold from pets
Given that I am ready to Admin page for get
When I will find pets by sold status
Then I taken to dashboard show sold status pets


Scenario: User will find status avaliable and pending from pets
Given that I am ready to Admin page for get
When I will find pets by avaliable and pending status
Then I taken to dashboard show avaliable and pending status pets

Scenario: User will find status avaliable and sold from pets
Given that I am ready to Admin page for get
When I will find pets by avaliable and sold status
Then I taken to dashboard show avaliable and sold status pets


Scenario: User will find status pending and sold from pets
Given that I am ready to Admin page for get
When I will find pets by pending and sold status
Then I taken to dashboard show pending and sold status pets

Scenario: User will find avaliable, pending, and sold status in petstore
Given that I am ready to Admin page for get
When I will find pets all valid
Then I taken to dashboard show all item status pets

Scenario: User will find status from pets with invalid input
Given that I am ready to Admin page for get
When I will find pets by status with invalid input
Then show error message invalid input status


!-- Finds Pets by ID


Scenario: User will find pet by ID not found
Given that I am ready to Admin page for get
When I will find pets by not found ID
Then I taken to dashboard show status pet not found


Scenario: User will find pet by Invalid ID supplied
Given that I am ready to Admin page for get
When I will find pets by Invalid ID supplied
Then I taken to dashboard show status Invalid ID supplied

!-- Returns pet inventories by status
Scenario: User will Returns pet inventories by status
Given that I am ready to Admin page for get
When I will Returns pet inventories by status
Then I taken to dashboard show pet inventories by status

!-- Find purchase order by ID
Scenario: User will Find purchase valid order ID
Given that I am ready to Admin page for get
When I will Find purchase valid order ID
Then I taken to dashboard show pet purchase valid order ID

Scenario: User will Find purchase order not found
Given that I am ready to Admin page for get
When I will Find purchase order not found
Then Show pet purchase order not found

Scenario: User will Find purchase invalid id Supplied
Given that I am ready to Admin page for get
When I will Find purchase order with invalid id Supplied
Then Show pet purchase order invalid id Supplied


!-- Logs user into the system
Scenario: User will Login valid data
Given that I am ready to Admin page for get
When I will login to my pet store with valid data
Then I taken to dashboard homepage

Scenario: User will Login with invalidusername/password supplied
Given that I am ready to Admin page for get
When I will login to my pet store with invalid data
Then Show error mesaage invalid username or paswword



!-- Logs out current logged in user session
Scenario: User will Logout
Given that I am ready to Admin page for get
When I will logout to my pet store
Then I logout from pet store homepage

!-- Get user by user name
Scenario: Get user by valid user name
Given that I am ready to Admin page for get
When I will Get user by valid user name
Then I got user by valid user name

Scenario: Get user by invalid user name
Given that I am ready to Admin page for get
When I will Get user by invalid user name
Then Show message error invalid username supplied


Scenario: Get user by user not found
Given that I am ready to Admin page for get
When I will Get user by invalid user name
Then Show message error invalid username supplied
