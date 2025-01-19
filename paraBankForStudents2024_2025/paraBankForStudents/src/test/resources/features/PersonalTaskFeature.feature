Feature: ParaBank Interaction Verification

  Scenario: Interacting with ParaBank elements and verifying changes
    Given I navigate to the ParaBank login page
    Then I should see a tooltip appear
    When I click on the ParaBank image
    Then I verify that nothing has changed
    When I click on the ParaBank "ParaBank Is Now Re-Opened" link
    Then I verify that something has changed
    When I click on the ParaBank logo
    Then I verify that something has changed
    When I click on the person button
    Then I navigate back
    And I verify that nothing has changed
