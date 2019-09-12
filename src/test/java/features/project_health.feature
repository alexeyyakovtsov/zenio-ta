@project_health

  Feature: Project Health

    Scenario: Create project for Project Health
      Given click Create project
      When modal windows is opened enter fill all field
      And click  Create button
      And click Make Activities
      And click Project  Health button
      And enter Number of team members
      And click Save team members
      Then project health page should be visible

    Scenario: Check status Perfect
      Given when open Project Health click Edit members
      When enter in number of team members = 3
      And click Save members
      Then status Health = Perfect!

    Scenario: Check status Healthy
        Given click Edit members
        When enter members = 4
        And click Save members button
        Then status Health = Healthy

    Scenario: Check status Unhealthy
      Given click  Edit members
      When enter  members = 2
      And click Save button
      Then status Health = Unhealthy

    Scenario: Check status Danger
      Given click   Edit members
      When enter   members = 1
      And click  Save button
      Then status Health = Danger!
      And delete project health