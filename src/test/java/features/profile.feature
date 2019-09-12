@settings

  Feature: Settings Test

    Scenario: Open Settings Page
      Given click Settings menu button
      Then should be visible title Settings
      And should be visible tabs Profile and Integration
      And should be visible section Basic Info
      And should be visible section Email and current email
      And should be visible section Change Password
      And should be visible password hint

    Scenario: Change User Name
        Given click on User Name field
        When delete old user name
        And enter new User Name
        And click Save Changes Name
        Then new user name should be changed

    Scenario: Change User Password
        Given input password field should be visible
        When enter Current password
        And enter New Password
        And click Save Changes password
        Then new password should be changed


