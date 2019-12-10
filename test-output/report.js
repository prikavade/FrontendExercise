$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test1Wikipedia.feature");
formatter.feature({
  "line": 2,
  "name": "To test the Search feature of Wikipedia",
  "description": "",
  "id": "to-test-the-search-feature-of-wikipedia",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SearchWikipedia"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Check the Functionality of Search",
  "description": "",
  "id": "to-test-the-search-feature-of-wikipedia;check-the-functionality-of-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens browser and launches Wikipedia url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on Wikipedia Page and checks the Title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Searches for \"furry rabbits\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Checks that \u0027did you mean\u0027 suggestion appears",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Checks that 20 search results appears",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Checks the first search result and its details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Closes the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "WikipediaStep.user_opens_browser_and_launches_url()"
});
formatter.result({
  "duration": 11854059900,
  "status": "passed"
});
formatter.match({
  "location": "WikipediaStep.user_is_on_Wikipedia_Page()"
});
formatter.result({
  "duration": 48487399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "furry rabbits",
      "offset": 14
    }
  ],
  "location": "WikipediaStep.searches_for(String)"
});
formatter.result({
  "duration": 4508688100,
  "status": "passed"
});
formatter.match({
  "location": "WikipediaStep.checks_that_did_you_mean_suggestion_appears()"
});
formatter.result({
  "duration": 2118529500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 12
    }
  ],
  "location": "WikipediaStep.checks_that_search_results_appears(int)"
});
formatter.result({
  "duration": 248729700,
  "status": "passed"
});
formatter.match({
  "location": "WikipediaStep.checks_the_first_search_result_and_its_details()"
});
formatter.result({
  "duration": 1394160000,
  "status": "passed"
});
formatter.match({
  "location": "WikipediaStep.closes_the_Browser()"
});
formatter.result({
  "duration": 4388630901,
  "status": "passed"
});
formatter.uri("Test2Travelex.feature");
formatter.feature({
  "line": 2,
  "name": "To test the slider feature of Travelx",
  "description": "",
  "id": "to-test-the-slider-feature-of-travelx",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SliderTravelex"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Check the Functionality of Slider for some elements",
  "description": "",
  "id": "to-test-the-slider-feature-of-travelx;check-the-functionality-of-slider-for-some-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens browser and launches Travelex url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User resizes the window to 550px",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User swipes left on the slider",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User swipes left again",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User validates that the item displayed is indeed the third item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Closes the Travelex Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TravelexStep.user_opens_browser_and_launches_travelex_url()"
});
formatter.result({
  "duration": 38056962600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "550",
      "offset": 27
    }
  ],
  "location": "TravelexStep.user_resizes_the_window_to_px(int)"
});
formatter.result({
  "duration": 300827201,
  "status": "passed"
});
formatter.match({
  "location": "TravelexStep.user_swipes_left_on_the_slider()"
});
formatter.result({
  "duration": 93831100,
  "status": "passed"
});
formatter.match({
  "location": "TravelexStep.user_swipes_left_again()"
});
formatter.result({
  "duration": 123085400,
  "status": "passed"
});
formatter.match({
  "location": "TravelexStep.user_validates_that_the_item_displayed_is_indeed_the_third_item()"
});
formatter.result({
  "duration": 57060200,
  "status": "passed"
});
formatter.match({
  "location": "TravelexStep.closes_the_Browser()"
});
formatter.result({
  "duration": 4141425099,
  "status": "passed"
});
});