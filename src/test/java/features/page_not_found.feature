@page_not_found

  Feature: Page Not Found 404 Test

    Scenario: Page Not Found 404 Test
      Given open invalid URL
      Then will be opened 404 page with error
      And the error code should be displayed
      And title error should be displayed
      And description title should be displayed
      And button Back to Home should be displayed

    Scenario:  Back to Home (Workspace) Page
      Given click Back to Home button
      Then will be redirection home page
      And all elements in login page should be visible