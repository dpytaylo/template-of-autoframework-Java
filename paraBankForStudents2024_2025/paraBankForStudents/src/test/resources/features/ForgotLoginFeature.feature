Feature: Smoke Test for "Forgot login info" Link

  Scenario: Verify "Forgot login info?" Link
      Given I navigate to the ParaBank login page to verify forgot login info link
      When I click the "Forgot login info?" Link
      Then I should be redirected to the password recovery page
