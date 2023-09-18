Feature: Search and checkout the product
@PlaceOrder
Scenario Outline: Search experience for product search in both home and offers page.
Given user is on GreenKart Landing Page
When user search with short name <Name> and extracted the actual name of the product
And Added "3" items of the selected product to cart
Then User proceed to checkout and validate the <Name> items in checkout page

And Verify user has ability to enter promo code and place the order

Examples:

| Name |
| TOM  |




