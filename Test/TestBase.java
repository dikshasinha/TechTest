package Test;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestBase {

	public WebDriver driver1;
	public WebDriver intialzeDriver() throws IOException
	{
	
		  
		  Properties prop= new Properties();
		  FileInputStream fis=new FileInputStream("C:\\Users\\Add\\Work_projects\\TechTest2\\Test\\datadriven.properties");
		  prop.load(fis);
		  String browserName=prop.getProperty("browser");
		  
		  if(browserName.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\Add\\Work_projects\\chromedriver_win32\\chromedriver.exe");

			   driver1=new ChromeDriver();
			  
		     //execute in chrome driver
		  }
		  else if (browserName.equals("firefox"))
			  driver1= new FirefoxDriver();
			   	  
			
driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
	return driver1;
	}}
