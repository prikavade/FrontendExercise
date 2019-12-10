@SliderTravelex
Feature: To test the slider feature of Travelx
  @Test
  Scenario: Check the Functionality of Slider for some elements
    Given User opens browser and launches Travelex url
    Then User resizes the window to 550px
    Then User swipes left on the slider
    Then User swipes left again
    Then User validates that the item displayed is indeed the third item
    And Closes the Travelex Browser