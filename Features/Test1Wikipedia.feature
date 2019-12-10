@SearchWikipedia
Feature: To test the Search feature of Wikipedia
  @Test
  Scenario: Check the Functionality of Search
    Given User opens browser and launches Wikipedia url
    When User is on Wikipedia Page and checks the Title
    Then Searches for "furry rabbits"
    Then Checks that 'did you mean' suggestion appears
    Then Checks that 20 search results appears
    Then Checks the first search result and its details
    And Closes the Browser