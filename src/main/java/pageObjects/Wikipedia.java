package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.TestBase;

import selenium.Wait;

public class Wikipedia extends TestBase {

	@FindBy(id="searchInput")
	WebElement searchInput;

	@FindBy(xpath="//*[@id=\"search-form\"]/fieldset/button")
	WebElement searchSubmit;


	@FindBy(xpath="//div[contains(text(),'Did you mean:')]")
	WebElement didYouMean;

	@FindBy(xpath="//*[@id='mw-search-DYM-suggestion']")
	WebElement suggestion;

	@FindBy(xpath="//*[@id='mw-search-top-table']/div[2]/strong[1]")
	WebElement numberSearchResult;

	@FindBy(xpath="//*[@id=\"mw-content-text\"]/div[3]/ul/li[1]/div[1]/a")
	WebElement firstSearchResult;

	@FindBy(xpath="//*[@id=\"toc\"]/div/h2")	
	WebElement contentTable;

	WebDriverWait wait;
	
	public Wikipedia(){

		PageFactory.initElements(driver,this);
	}

	public void  validateWikipediaPageTitle(){

		Wait.untilPageLoadComplete(driver);
		String title =  driver.getTitle();
		log.info("Checking the Title of the Wikipedia Page");
		Assert.assertEquals("Wikipedia",title,"The title is not as expected");
		log.info("The Title of the Wikipedia Page is as expected");

	}
	public void searchText(String Input)
	{
		log.info("Entering the search input and submitting");
		searchInput.sendKeys(Input);
		searchSubmit.submit();
	}

	public void validateDidYouMean()
	{
		System.out.println(didYouMean.getText()+"didi");
		Assert.assertEquals("Did you mean: fury rabbit",didYouMean.getText()," 'did you mean' suggestion is not displayed");
		log.info(" 'did you mean' suggestion appeared");

		log.info("Clicking on Suggestion");
		suggestion.click();
	}

	public void validateSearchResult(int count)
	{
		log.info("Checking the Search Results");

		Assert.assertEquals("1 – "+count,numberSearchResult.getText(),"20 search results not appeared");
		log.info("20 search results appeared");
	}


	public void validateFirstSearchResult()
	{
		log.info("Check the First Search Results");	
		driver.findElement(By.linkText(firstSearchResult.getText())).click();

		log.info("Checking whether the article has title");
		String title =  driver.getTitle();
		Assert.assertNotNull(title);
		log.info("The article has title\"");

		log.info("Checking the Table of Contents on the first search result page");
		Assert.assertEquals("Contents",contentTable.getText(),"The content Table is not displayed");

	}

	public void wikiTearDown() {
		driver.close();
		log.info("Browser closed");
	}

}