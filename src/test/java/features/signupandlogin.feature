Feature: Create Account
  Background:
    Given i am at Target Homepage
    And i click on sign in button


  @test3
  Scenario: verify user can create new account using valid information

    And i click on create account from tagethomepage
    And i enter valid email address from create account page
    And i enter first name from create account page
    And i enter last name from create account page
    And i enter email or phone number from create account page
    And i enter create password from create account page
    When i click on the create account button from create account page
    Then i should be able to successfully createanaccount



  @test3
  Scenario: verify user can sign in using newly created valid credentials

    And i click on sign in button to navigate to sign in
    And i enter email or phone number to sign in
    And i enter password to sign in
    When i click on SignInbutton
    Then i should be able to reSignin successfully