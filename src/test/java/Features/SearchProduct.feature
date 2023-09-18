Feature: Search and place the order for products
@OfferPage
Scenario Outline: Search experience for product search in both home and offers page.
Given user is on GreenKart Landing Page
When user search with short name <Name> and extracted the actual name of the product
Then user go and search <Name>  short name in offer page to check if product exists
And Validate product name in home page matching with offers page

Examples:

| Name |
| TOM  |
| BEET |



