Feature: Create Account
@product
    Scenario: verify user can search a product and add the product to the cart
      Given i am at Target Homepage
      And i enter Gift Cards on the search box
      And i click on search icon
      And i click on specialty gift cards
      And i click on Starbucks gift card link
      And i click on value $50
      When i click on Add to Cart
      Then i should be able to



