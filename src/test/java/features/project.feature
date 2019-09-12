@project_page

Feature: Project Test

  Background: Log in Zenio dev User
    Given open login page
    When enter user email
    And enter user  password
    And click  Continue button
    Then user workspace should be visible

  Scenario: Create new project without integration
    Given click button + New Project
    When modal windows is opened enter project name
    And click Create button
    Then element canvas  should be visible

  Scenario: Rename project
    Given click menu button My projects
    When will open list of project click popup on projects
    And click Rename menu item
    And when modal windows is opened rename project name
    And click  Save
    Then the name of the project successfully changed

  Scenario: Invite new member in project
    Given will open project list click popup on projects
    When click   Team button
    And when will open Team project enter email in search field
    And click  button Send Invite
    Then member with email alexey.yakovtsov@zensoft.io successfully added

  Scenario: Delete project
    Given return to the projects page
    When project page is open click on project popup
    And choose Delete Project menu item
    And confirm delete project, click Delete button
    Then project successfully deleted