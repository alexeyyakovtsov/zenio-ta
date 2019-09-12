@project_integration_quick

  Feature: Project integration with Quick Import Test

    Scenario: Create new project with integration and Quick Import
      Given click create new project button
      When modal windows is opened enter quick import project name
      And click switch Integration with PT
      And enter API Token in field
      And enter Project ID in field
      And click on checkbox Use Quick Import
      And click Create project button
      Then will opened Quick Import page

    Scenario: Select all and Deselected all epics
      Given all epics and description should be visible
      When click Deselected All button
      Then all epics should become gray
      And the button name must be Create project
      And counter Selected Epics should be = 0

    Scenario: Create project with Make Activities
      Given click Select All button
      When all epics will be selected
      And counter not equal to 0
      And click Make Activities button
      Then project with Quick Import should be created

    Scenario: Rename project with Quick Import
      Given click menu button  "My projects"
      When will open list of project click popup on projects with quick import
      And click  "Rename" menu item
      And when modal windows is opened rename project with quick import
      And click button Save
      Then the name of the project with quick import successfully changed

    Scenario: Invite new member in project with Quick Import
      Given will  open project list click popup on projects
      When click button  "Team"
      And when will open Team project with Quick Import enter email in search field
      And click   button Send Invite
      Then member with email successfully added

    Scenario: Delete project with Quick Import
      Given return  to the projects page
      When project list is open click on project popup
      And choose Delete Project menu item
      And confirm delete project, click Delete button
      Then project with Quick Import successfully deleted

