@workspace

Feature: Workspace Test

  Scenario: Rename Workspace
    Given open workspace list
    When click Rename link
    And when open Edit Workspace modal window insert new workspace name
    And click save new workspace name
    Then new workspace name should be visible

  Scenario: Workspace - List of Members
    Given click Account Members
    When opened Account members page should be visible title page
    Then owner should be visible workspace owner
    And workspace owner should be Active
    And should see the number of workspace members
