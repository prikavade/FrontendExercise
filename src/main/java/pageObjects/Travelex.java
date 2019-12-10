package pageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.TestBase;

import selenium.Wait;

public class Travelex extends TestBase{

	WebDriverWait wait;
	
	@FindBy(xpath="//button[contains(text(),'2')]")
	WebElement  swipe1;
	
	@FindBy(xpath="//button[contains(text(),'3')]")
	WebElement  swipe2;

	@FindBy(xpath="//a[contains(text(),'Buy Foreign Currency')]")
	WebElement item3;

	@FindBy(xpath="//span[@class='inner-wrap']//a[contains(text(),'Travelex Money Card')]")
	WebElement item1;

	public Travelex(){
		PageFactory.initElements(driver,this);
	}

	public void  resizeWindow(int targetSize) {
		Dimension d = new Dimension(targetSize,600);
		driver.manage().window().setSize(d);
	} 

	public void swipeLeft(int swipeCount){
		if(swipeCount==1)
			swipe1.click();	
		else
			swipe2.click();	
	} 

	public void scrollItem()
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",item1);
	}

	public void checkItem(){
		Assert.assertEquals("Buy Foreign Currency",item3.getText(), "The Item is not the third Item i.e. it is not Buy Foreign Currency");
		log.info("The item displayed is indeed the third item i.e. it is Buy Foreign Currency ");
	}

	public void travelTearDown() {
		driver.close();
		log.info("Browser closed");
	}
}
