package firsttestngpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.*;
//import org.openqa.selenium.*;
public class FirstTestNGFile {
	
	public WebDriver driver;
	public String baseUrl,nodeUrl;
	
	//@BeforeTest
//	public void setUp() throws MalformedURLException {
//		
//		//baseUrl="http://www.houseofittehad.com";
//		
////		baseUrl="http://www.beechtree.pk";
////		nodeUrl="http://192.168.88.60:5566/wd/hub";
////		DesiredCapabilities capability=DesiredCapabilities.firefox();
////		capability.setBrowserName("firefox");
////		capability.setPlatform(Platform.LINUX);
////		System.setProperty ("webdriver.gecko.driver" , "/home/rbs/Downloads/geckodriver");
////		driver=new RemoteWebDriver(new URL(nodeUrl),capability);
//		
////		System.setProperty("webdriver.gecko.driver", "/home/rbs/Downloads/geckodriver");
////        driver = new FirefoxDriver();
//		
////		System.setProperty("webdriver.chrome.driver", "/home/rbs/Downloads/IdeaProjects/mariab_test_cases/chromedriver");
////		driver = new ChromeDriver();
//        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	 }

	@Test
  public void verifyHomePageTitle() {
//	  driver.get(baseUrl);
//	  String expectedTitle="BEECHTREE";
//	  String actualTitle=driver.getTitle();
//	  Assert.assertEquals(actualTitle, expectedTitle);
//	  System.out.println("Test Passed :)");
		
	System.out.println("Welcome to Jeinkns World");


  }
//	  @Test
//	  public void testHodtng() throws Exception {
//	    driver.get(baseUrl + "/");
//	    driver.findElement(By.cssSelector("span.close")).click();
//	    driver.findElement(By.xpath("//img[contains(@src,'http://www.houseofittehad.com/skin/frontend/rwd/shopistan/images/home-img/xhome-thumb-2.png.pagespeed.ic.FXGuc6mEHC.jpg')]")).click();
//	    
//	    WebDriverWait wait4 = new WebDriverWait(driver, 200);
//		
//		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@onclick=\"onProductClick('2433','LF-GN-2378 (3 PCS)','German Linen','http://www.houseofittehad.com/pk/lf-gn-2378-3-pcs-2433.html','Product Listing','Listing')\"]")));
//		
//	    driver.findElement(By.xpath("//a[@onclick=\"onProductClick('2433','LF-GN-2378 (3 PCS)','German Linen','http://www.houseofittehad.com/pk/lf-gn-2378-3-pcs-2433.html','Product Listing','Listing')\"]")).click();
//	    
//	    driver.findElement(By.cssSelector("button.button.btn-cart")).click();
//	    driver.findElement(By.cssSelector("a.button.checkout-button > span")).click();
//	    driver.findElement(By.id("billing:firstname")).clear();
//	    driver.findElement(By.id("billing:firstname")).sendKeys("test");
//	    driver.findElement(By.id("billing:lastname")).clear();
//	    driver.findElement(By.id("billing:lastname")).sendKeys("test");
//	    driver.findElement(By.name("billing[email]")).clear();
//	    driver.findElement(By.name("billing[email]")).sendKeys("test@shopistan.pk");
//	    driver.findElement(By.id("billing:confirm_email")).clear();
//	    driver.findElement(By.id("billing:confirm_email")).sendKeys("test@shopistan.pk");
//	    driver.findElement(By.id("billing:street1")).clear();
//	    driver.findElement(By.id("billing:street1")).sendKeys("test");
//	    driver.findElement(By.id("billing:street2")).clear();
//	    driver.findElement(By.id("billing:street2")).sendKeys("test");
//	    new Select(driver.findElement(By.id("billing:city"))).selectByVisibleText("Lahore");
//	    driver.findElement(By.id("billing:postcode")).clear();
//	    driver.findElement(By.id("billing:postcode")).sendKeys("0300");
//	    driver.findElement(By.id("billing:telephone")).clear();
//	    driver.findElement(By.id("billing:telephone")).sendKeys("03001001001");
//	    driver.findElement(By.id("tel2")).clear();
//	    driver.findElement(By.id("tel2")).sendKeys("03001001001");
//	    driver.findElement(By.cssSelector("button.button.btn-checkout")).click();
//	  }
	
//	@AfterTest
//	public void afterTest(){
//		driver.quit();
//		
//	}
	

}
