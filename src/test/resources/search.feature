Feature:checking the Search functionality working as per expected
  @search1
  Scenario:Verify user is able to search an item with valid data
    Given user is in homepage
    When user types in valid data in the search box "summer dresses"
    And clicks on search icon
    Then user should  able to view the message "summer dresses"
    When user navigates back


  @search2
  Scenario:Verify user is able to search an item with valid data
    Given user is in homepage
    When user types in valid data in the search box "chiffon dress"
    And clicks on search icon
    Then user should  able to view the message "Top sellers"
    When user navigates back


  @Notvalidsearch
  Scenario: User is not able to search with invalid data
    Given user is in homepage
    When user types in invalid data in the search box as "sleepers"
    And clicks on search icon
    Then user should view the message "No results were found for your search"
    When user navigates back