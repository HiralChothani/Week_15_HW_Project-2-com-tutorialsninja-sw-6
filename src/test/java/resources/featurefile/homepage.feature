Feature: TopMenu Test
  As user I want to login into Tutorialninja website

  #@sanity @regression
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on homepage
    When  I Mouse hover on “Desktops” Tab and click
    And   I click on the menu “Show All Desktops”
    Then  I should navigate to desktop page successfully
    And   I should see the text ‘Desktops’

 # @smoke @regression
  Scenario: Verify user should navigate to LaptopsAndNotebooks page successfully
    Given I am on homepage
    When  I Mouse hover on “Laptops & Notebooks” Tab and click
    And   I click on the menu “Show All Laptops & Notebooks”
    Then  I should navigate to desktop page successfully
    And   I should see the text ‘Laptops & Notebooks’

  #@regression
  Scenario: Verify user should navigate to components page successfully
    Given I am on homepage
    When  I Mouse hover on “Components” Tab and click
    And   I click on the menu “Show All Components”
    Then  I should navigate to desktop page successfully
    And   I should see the text ‘Components’







