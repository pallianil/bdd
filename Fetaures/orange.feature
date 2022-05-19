Feature: Orange page login

  Scenario: Logo present check
    Given I Launch a Browser
    When I open hrm homepage
    Then i verify the Logo is present
    And close browser