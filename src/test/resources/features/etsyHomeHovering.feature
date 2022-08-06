Feature: Validation of  mouse hovering on Etsy Home Page

  Scenario: Test validation of mouse hovering
    Given user is on Etsy Home page
    When Auto Action class generate
    Then mouse will hover on home favorites by itself
