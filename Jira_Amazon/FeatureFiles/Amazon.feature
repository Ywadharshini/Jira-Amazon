Feature: Search Functionality 

Background: Home Page 

	Given user launch The Application 
	
	
Scenario: Search Function 

	When user Click On The Today's Deals Link in Amazon Home Page 
	And user Click On Price Link Under Price Category 
	And user click On Any One Of The Product 
	And user Click On the Bluetooth Product 
	And user Change The Driver Position 
	And user Change The Colour Of The Product 
	And user Change The Quantity Of The Product 
	And user Click On The Add To Cart Button 
	Then user Click On The Cart Button to view the products and its Navigate to "Amazon.in Shopping Cart"
	