package stepDefinitions;

import com.qa.base.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Wikipedia;

public class WikipediaStep extends TestBase {

	Wikipedia wikipedia;
	
	
	@Given("^User opens browser and launches Wikipedia url$")
	public void user_opens_browser_and_launches_url() {
		initialization("wikipedia");
		wikipedia = new Wikipedia();
	}

	@When("^User is on Wikipedia Page and checks the Title$")
	public void user_is_on_Wikipedia_Page(){
		wikipedia.validateWikipediaPageTitle();   
	}

	@Then("^Searches for \"([^\"]*)\"$")
	public void searches_for(String input) {
		wikipedia.searchText(input);
	}

	@Then("^Checks that 'did you mean' suggestion appears$")
	public void checks_that_did_you_mean_suggestion_appears(){
		wikipedia.validateDidYouMean();
	}

	@Then("^Checks that (\\d+) search results appears$")
	public void checks_that_search_results_appears(int count) {
		wikipedia.validateSearchResult(count);
	}

	@Then("^Checks the first search result and its details$")
	public void checks_the_first_search_result_and_its_details()  {
		wikipedia.validateFirstSearchResult();
	}
	
	@And("^Closes the Browser$")
	public void closes_the_Browser()
	{
		wikipedia.wikiTearDown();
		log.info("Exit!!");
	}
}