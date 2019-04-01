Meta: @Login


Narrative:
As a user
I want to perform login on linkedin
So that I can see my news feed

Scenario: Scenario login success
Meta: @Login Success

Given I open linkedin login page
When I input email and password v_manaf@yahoo.co.id dan FSAI11890cv4048
When I click button sign in
Then I got to my news feed

Meta: @Login Failed
Scenario: Scenario login failed

Given I open linkedin login page
When I input email and password v_manaf@yahoo.co.id dan 103214000
When I click button sign in
Then I got to show error message

Scenario: Scenario login failed
Given I open linkedin login page
When I input email and password v_manaf@yahoo.com dan 103214000
When I click button sign in
Then I got to notification as human





