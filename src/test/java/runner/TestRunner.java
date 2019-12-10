package runner;

import com.cucumber.listener.Reporter;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.AfterClass;
import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features", //the path of the feature files
		tags= { "@SearchWikipedia,@SliderTravelex"},//tags to execute,
		glue = {"stepDefinitions"}, //the path of the step definition files
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false//to check the mapping is proper between feature file and step def file
		)

public class TestRunner extends AbstractTestNGCucumberTests  {
	WebDriver driver;

	@AfterClass
	public void getReportConfigPath(){
		String reportConfigPath = System.getProperty("user.dir")+ File.separator +"extent-config.xml";
		Reporter.loadXMLConfig(new File(reportConfigPath));
	}


}