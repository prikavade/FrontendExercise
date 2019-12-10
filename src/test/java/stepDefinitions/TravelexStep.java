package stepDefinitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.Travelex;
import pageObjects.Wikipedia;
import selenium.Wait;

public class TravelexStep extends TestBase {
	
	Travelex travelex;
	Wikipedia wikipedia;
	
	@Given("^User opens browser and launches Travelex url$")
	public void user_opens_browser_and_launches_travelex_url() {
		initialization("travelex");
		travelex = new Travelex();
	}

	@Then("^User resizes the window to (\\d+)px$")
	public void user_resizes_the_window_to_px(int targetSize){
		Wait.untilPageLoadComplete(driver);
		travelex.resizeWindow(targetSize);
		travelex.scrollItem();
	}

	@Then("^User swipes left on the slider$")
	public void user_swipes_left_on_the_slider(){
		travelex.swipeLeft(1);
	}

	@Then("^User swipes left again$")
	public void user_swipes_left_again(){
		travelex.swipeLeft(2);
	}

	@Then("^User validates that the item displayed is indeed the third item$")
	public void user_validates_that_the_item_displayed_is_indeed_the_third_item() {
		travelex.checkItem();
	}

	@And("^Closes the Travelex Browser$")
	public void closes_the_Browser()
	{
		travelex.travelTearDown();
		log.info("Exit!!");
	}
	
}
