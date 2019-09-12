@forgot_password

  Feature: Forgot Password Test

    Scenario: Forgot Password Test
      Given open dev login page
      And click Forgot Password link
      And enter in email field
      And click Send button
      Then a notification is displayed about the successful sending of an email
