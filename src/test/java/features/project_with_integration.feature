@project_integration

  Feature: Project integration Test

    Scenario: Create new project with integration
      Given click  create new project button
      When modal windows is opened enter integration project name
      And click  switch Integration with PT
      And enter  API Token in field
      And enter  Project ID in field
      And click  Create project button
      Then project will be created, the story in the imported Drawer should be displayed

    Scenario: Rename project with Integration
      Given click project list
      When click popup on projects with integration
      And click  Rename menu item
      And when modal windows is opened rename project with integration
      And click button  Save
      Then the name of the project with integration successfully changed

    Scenario: Invite new member in project with Integration
      Given will  open project list click popup on projects with integration
      When click button  Team
      And when will open Team project with Integration enter email in search field
      And click button Send Invite
      Then member  with email successfully added

    Scenario: Delete project with Integration
      Given return to the projects list
      When project list is open click on project with integration popup
      And choose  Delete Project menu item
      And confirm delete project with integration, click Delete button
      Then project with Integration successfully deleted