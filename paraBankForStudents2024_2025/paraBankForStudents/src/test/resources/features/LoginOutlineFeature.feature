Feature: Smoke Test for Login Form

  Scenario Outline: Create test users
      Given the registration form is displayed with all mandatory fields
      When the user has entered "<Username>", and "<Password>" and the register button is pressed

      Examples:
        | Username | Password |
        | johndoe341 | 123 |
        | johndoe391 | 123 |

  Scenario Outline: Ensure login action is triggered with valid input
      Given the login form is displayed with all mandatory fields
      When the user has entered "<Username>", and "<Password>" and the LOG IN button is pressed
      Then the login action should be triggered successfully
      And the user should log out

      Examples:
        | Username | Password |
        | johndoe341 | 123 |
        | johndoe391 | 123 |
