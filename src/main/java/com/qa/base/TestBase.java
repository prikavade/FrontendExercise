package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public enum OS {
		WINDOWS, LINUX, MAC
	};

	private static OS os = null;

	public static OS getOS() {
		if (os == null) {
			String operSys = System.getProperty("os.name").toLowerCase();
			if (operSys.contains("win")) {
				os = OS.WINDOWS;
			} else if (operSys.contains("nix") || operSys.contains("nux")
					|| operSys.contains("aix")) {
				os = OS.LINUX;
			} else if (operSys.contains("mac")) {
				os = OS.MAC;
			}
		}
		return os;
	}

	public static void initialization(String launchUrl){
		log = Logger.getLogger(TestBase.class.getName());//
		String browserName = prop.getProperty("browser");
		OS os = getOS();
		log.info("Initialization");

		switch (getOS()) {
		case WINDOWS:            
			if(browserName.equals("chrome")){								
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator + "src" +File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "windows" + File.separator + "chromedriver.exe");	
				driver = (WebDriver) new ChromeDriver();
				log.info("Launching Chrome on Windows Operating System");
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ File.separator + "src" +File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "windows" + File.separator + "geckodriver.exe");	
				driver = (WebDriver) new FirefoxDriver();
				log.info("Launching Firefox on Windows Operating System");
			}
			break;

		case LINUX:
			if(browserName.equals("chrome")){							
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ File.separator + "src" +File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "linux" + File.separator + "chromedriver");	
				driver = (WebDriver) new ChromeDriver();
				log.info("Launching Chrome on Linux Operating System");
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ File.separator + "src" +File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "linux" + File.separator + "geckodriver");	
				driver = (WebDriver) new FirefoxDriver();
				log.info("Launching Firefox on Linux Operating System");
			}
			break;        	

		case MAC:
			if(browserName.equals("chrome")){							
				System.setProperty("webdriver.chrome.driver", File.separator + "src" +File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "mac" + File.separator + "chromedriver");	
				driver = (WebDriver) new ChromeDriver();
				log.info("Launching Chrome on MAC Operating System");
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", File.separator + "src" +File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "linux" + File.separator + "geckodriver");	
				driver = (WebDriver) new FirefoxDriver();
				log.info("Launching Firefox on MAC Operating System");
			}
			break;		
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);



		if(launchUrl=="wikipedia")	
		{
			driver.get(prop.getProperty("wikipediaUrl"));
		}
		else if(launchUrl=="travelex")	
		{
			driver.get(prop.getProperty("travelexUrl"));	
		}
	}
}
