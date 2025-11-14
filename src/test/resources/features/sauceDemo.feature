# Author: Ricardo y Jeferson
#Language: en

Feature: Login into saucedemo, add items to the shopping cart, remove products, and check the number of items in the cart.
	As a client I want to login into saucedemo store to explore and buy products
	As a client I want to be able to add products to my shopping cart to select the products to buy
	As a client I want to be able to remove products from my shopping cart to remove products i don't want to buy

	Scenario: Login into the Saucedemo store.
	
	Given I am on the Saucedemo login page
	When I enter my valid credentials
	Then I can access the Saucedemo store
	
	Scenario: Add products to the shopping cart.
	
	Given I am logged into the Saucedemo store
	When I select a product to add to the cart
	Then I can see the product in my shopping cart
	
	Scenario: Remove products from the shopping cart.
	
	Given I have products in my shopping cart
	When I remove a product from the cart
	Then I can see that the product is no longer in my shopping cart

	Scenario: Fail to login into the Saucedemo store due to invalid credentials.

	Given I am on the Saucedemo login page
	When I enter invalid credentials
	Then I can see an error message and I cannot access the store
