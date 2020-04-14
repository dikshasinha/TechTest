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



public class Homepage extends TestBase {
	
	  //static WebDriver driver;
	
	  @Test
	  
	    public void HomepageTest1() throws IOException
	    {
		  driver1=intialzeDriver();
		  driver1.get("http://automationpractice.com/index.php");
		  
	    		/*throws IOException
	    {
	    //public static void main(String[] args) {
		// TODO Auto-generated method stub
									
		//create Driver Object for chrome driver
		  
		  Properties prop=new Properties();
		  FileInputStream fis=new FileInputStream("C:\\Users\\Add\\Work_projects\\TechTest1 (1)\\TechTest1\\src\\datadriven.properties");
		  prop.load(fis);
		  System.out.println(prop.getProperty("URL"));
		  if(prop.getProperty("browser").equals("chrome"))
		  {
			  WebDriver driver=new ChromeDriver();
		  }
        /*ChromeOptions options =new ChromeOptions();
        options.addArguments("headless");
        driver= new ChromeDriver(options);
                
		
		
		else if(prop.getProperty("browser").equals("firefox"))
		{
			WebDriver driver=new FirefoxDriver();
		}
		
			
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Add\\Work_projects\\chromedriver_win32\\chromedriver.exe");
			
		//WebDriver driver= new RemotewebDriver(new URL("http://localhost:4444/wd/hub"),dc);*/
		driver1.get("http://automationpractice.com/index.php");

		//To maximize browser
		driver1.manage().window().maximize();
		
		//To delete site cookies
		driver1.manage().deleteAllCookies();
		
		//Implicit wait to manage delays in action	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
		
		String[] names= {"Printed Summer Dress"};
		
		// To open test url
		//driver1.get("http://automationpractice.com/index.php");
		
		
		List<WebElement> products=driver1.findElements(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a"));
		for(int i=0;i<products.size();i++)
		{
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		List namesList = Arrays.asList(names);
		
		if(namesList.contains(formattedName));
		
		{
		
		System.out.println(driver1.getTitle()); // validate the Page Title
		
		System.out.println(driver1.getCurrentUrl()); // validate URL is correct
		
	   	//to find summer dress and click on 	
		driver1.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a")).click();
		
		
		}
		}
				
				
		//to add on cart
		driver1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")).click();
		
		//to scroll to page and wait and add to basket
		
		WebDriverWait wait = new WebDriverWait(driver1, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")));
		 //Scroll down the webpage by 5000 pixels  
		JavascriptExecutor jse1 = (JavascriptExecutor)driver1;
		jse1.executeScript("scroll(0,5000);");
		
		driver1.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		
		//to page and wait and proceed to checkout
		
		WebDriverWait wait1 = new WebDriverWait(driver1, 4);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")));
		 //Scroll down the webpage by 500 pixels  
		JavascriptExecutor jse2 = (JavascriptExecutor)driver1;
		jse2.executeScript("scroll(0, 500);");
		driver1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		
		//to page and wait and navigate to signin page
		
		WebDriverWait wait2 = new WebDriverWait(driver1, 4);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")));
		 //Scroll down the webpage by 500 pixels  
		JavascriptExecutor jse3 = (JavascriptExecutor)driver1;
		jse3.executeScript("scroll(0, 500);");
		driver1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));

		

	

		
			driver1.close();
		
		
		
		}}
		
	