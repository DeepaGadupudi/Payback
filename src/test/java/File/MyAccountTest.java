package File;

import org.testng.annotations.Test;

import Com.demo.PayBack.MyAccountPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyAccountTest {
  @Test
  public void verification()throws InterruptedException{
	  
	  System.setProperty("Webdriver.chrome.driver","‪C:\\chromedriver_win32.zip");
	  WebDriver driver = new ChromeDriver();
	  //navigate to app
	  driver.get("https://www.payback.in/");
	  //maximize the window
	  driver.manage().window().maximize();
	//  driver.navigate().to("https://www.payback.in/");
//	  driver.findElement(By.linkText("Login")).click();
	  MyAccountPageFactory page = new MyAccountPageFactory(driver);
	  page.Login1();
	  page.CardNo();
//	  Page.paylog();
//      Thread.sleep(2000);
//	  Page.MobileNumber();
//	  Thread.sleep(2000);
	  page.pin();
	  Thread.sleep(2000);
	  page.robo();
	  Thread.sleep(2000);
	  page.log();
	  Thread.sleep(2000);
	  page.username();
	  Thread.sleep(4000);	
	  page.myprofile();
	  Thread.sleep(1000);
	  page.username1();
	  Thread.sleep(1000);
	  page.mycards();
	  Thread.sleep(1000);
	  page.viewtransactions();
	  Thread.sleep(1000);
	  page.username2();
	  Thread.sleep(1000);
	  page.mytransactions();
	  Thread.sleep(1000);
	  page.RedeemCatalogue();
	  Thread.sleep(1000);
//	  page.RedeemVouchers();
//	  Thread.sleep(1000);
	  page.username1();
	  Thread.sleep(1000);
	  page.myorder();
	  Thread.sleep(1000);
	  page.username1();
	  Thread.sleep(1000);
	  page.logout();
	  Thread.sleep(1000);
	  
  }
}
