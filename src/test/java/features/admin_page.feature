@admin_page

Feature: Admin Page Test

  Scenario: Sign Up for Early Access
    Given landing page "https://dev.zenio.co"
    When enter email for Early Access
    Then message "Thanks for requesting access. We’ll send you an email at 'email' when we’re ready to invite you in" is displayed successfully

  Scenario: Log in Zenio dev User = Admin
    Given open landing page "https://dev.zenio.co"
    When click "Sign In" link
    And open Login page enter Email: "zenio@zensoft.io"
    And enter password "12345678"
    And click "Continue" button
    Then project list should be visible

  Scenario: Open List of users
    Given click   menu button "Admin"
    Then open page "List of Users" should be visible tabs "Users" and "Early Access Request"

  Scenario: Open Early access list
    Given click tab "Early Access Request"
    Then open list "Early Access Request" should be visible columns "Email" "Request Date" "Status"

  Scenario: Check email for Early Access
    Given click  tab "Early Access Request"
    Then user with email should be visible

  Scenario: Approve user Early Acccess
    Given click "Approve" Early Access button
    Then user with Email status should be "Approved"

  Scenario: Invite by Email
    Given click "Invite" on List of Users
    And enter invite email
    And click "Invite" on Invite by Email form
    Then user with invite email should be visible



