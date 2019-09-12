@cli_documentation

  Feature: CLI Documentation

    Scenario: Open CLI Documentation page
      Given click CLI Documentation button
      When url page should be equals cli
      Then page name should be visible
      And title page should be visible
      And sidebar menu should be visible
      And download button should be visible
      And anchor Purpose should be visible
      And anchor Download should be visible
      And anchor Installing should be visible
      And anchor Running should be visible
      And anchor Commands should be visible

