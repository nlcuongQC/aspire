@aspire
Feature: Register

  Background:
    Given homepage is opened
    And I open Register page

  @register
  Scenario: Blank register form
    Then I should see Continue button is disabled

  @register
  Scenario Outline: Invalid <Case>
    When I input <Case> with <Value>
    Then I should see <Case> error <Error>
    Examples:
      | Case      | Value   | Error                                              |
      | full_name | 1       | Full Name as per ID must be at least 2 characters. |
      | email     | @       | Email address must be a valid email address.       |
      | phone     | 1234567 | Phone number must be at least 11 characters.       |

  @register
  Scenario: Valid data with mobile OTP
    When I fill register form with valid data
    And I click to Continue button
    And Mobile OTP page is opened
    And I input OTP
    And I should see Register complete page is opened
    And I click to Continue button in complete page
    And Incorporate selector page is opened
    And I click to registered business continue button
    And Register select method page is opened
    And I click to Standard registration Get started button
    And Personal details page is opened
    And I click to Get started button in Person details
    And I choose date of birth
    And I choose Nationality ddl is Albania
    And I choose Gender ddl is Male
    And I choose interested products
    And I click Submit Person details button
    And I input OTP
    And Business Details is opened
    And I click to Get started button in Business details
    And I input Business name
    And I choose registration type dll Sole proprietorship
    And I input UEN
    And I choose Industry Manufacturing
    And I choose Sub Industry Chemicals
    And I click Submit Business details button