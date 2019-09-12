# Automated Tests for Zenio project

## Technology stack used
1. Java
2. Cucumber
3. Selenide
4. Page objects pattern
5. Allure reports

## Project structure

Folder name  | File content
-------------|----------------------
features     | Features written in Cucumber
page_objects | Page objects
runner       | Script launch settings
steps        | Steps for scenarios
utils        | Project variables

## Tested Features
1. Admin Page
    * Landing Page Early Access
    * Login Admin user
    * Testing List of Users and Early Access list 
    * Check and approve user Early Access
    * Invite user in Zenio
2. Forgot Password
3. Project without integration
    * Create new project
    * Rename project
    * Invite new member in project
    * Delete project
4. Project Health
    * Check status: Perfect
    * Check status: Healthy
    * Check status: Unhealthy
    * Check status: Danger
5. Project with integration
     * Create new project with integration
     * Rename project with integration
     * Invite new member in project with integration
     * Delete project with integration
6. Project with integration and Quick Import
     * Create new project with integration
     * Select All and Deselected All epics
     * Create new project with all epics
     * Rename project with Quick Import
     * Invite new member in project with Quick Import
     * Delete project with Quick Import
7. Workspace
    * Rename workspace
    * Workspace - List of Members
8. Billing and Pricing
    * Subscribe page
    * Edit subscription details
    * Cancel subscription
    * Add new Payment Method
9. User Settings
    * Open Settings Page
    * Change User Name
    * Change User Password
10. Page Not Found (404)
    * Page Not Found
    * Return to Home (Workspace) Page
11. CLI Documentation
    * Check elements on CLI Documentation Page