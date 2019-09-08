Feature: Sig Test

  Scenario Outline: As a user I want to login successfully
    Given user goes to Home Page
 #  And I see a logo banner
    And I click on Sign in button
    And I enter my "<email>" in the email text field
    And I enter my "<password>" in my password input box
    When I click on Login button
    Then I verify that  I am logged in successfully
   # And I sign out

    Examples: 
      | email                    | password  |
      | davin.riches@gmail.com   | Today01   |