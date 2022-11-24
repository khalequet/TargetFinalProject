Feature: Search a Product
@test11
    Scenario: verify user can search a product and add the product to the cart
      Given i am at Target Homepage
      And i enter bedside lamp on the search box
      And i click on search icon
      And i click on Accent table lamps
      And i click on Accent table lamp picture
      And i click on Add to cart button
      When i click on Shop This Store Popup
      And i click on Second Add to cart button
      And i click on SignIn button from product cart page
      And i enter valid email
      And i enter valid password
      And i click on Signin Submit button































