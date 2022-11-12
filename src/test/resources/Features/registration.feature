Feature: user registration
Scenario: user registration with different data
Given user is on registration page
When user enters following user details
	|naven|auto|nav@gmail.com|999999|London|
	|ranto|SQA|ran@gmail.com|8888888|Bandung|
	|melsi|pet|melsi@gmail.com|123456|Bandung|
Then user registration should be successfull

Scenario: user registration with different data with columns
Given user is on registration page
When user enters following user details with columns
	|firstname|lastname|email|phone|city|
	|naven|auto|nav@gmail.com|999999|London|
	|ranto|SQA|ran@gmail.com|8888888|Bandung|
	|melsi|pet|melsi@gmail.com|123456|Bandung|
Then user registration should be successfull
