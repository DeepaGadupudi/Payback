package File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.demo.PayBack.MyAccountPageFactory;

public class MyAccounttestNG {
  @Test(priority=0)
  public void myprofile() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\chromedriver_win32.zip");
	  WebDriver driver = new ChromeDriver();
	//navigate to app
	  driver.get("https://www.payback.in/");
	  //maximize the window
	  driver.manage().window().maximize();
	  MyAccountPageFactory page = new MyAccountPageFactory(driver);
	  page.Login1();
	  page.CardNo();
	  page.pin();
	  Thread.sleep(2000);
	  page.robo();
	  Thread.sleep(2000);
	  page.log();
	  Thread.sleep(2000);
	  page.username();
	  Thread.sleep(4000);	
	  page.myprofile();
	  Thread.sleep(2000);
	  driver.close();
  }
  @Test(priority=1)
  public void mycards() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\chromedriver_win32.zip");
	  WebDriver driver = new ChromeDriver();
	//navigate to app
	  driver.get("https://www.payback.in/");
	  //maximize the window
	  driver.manage().window().maximize();
	  MyAccountPageFactory page = new MyAccountPageFactory(driver);
	  page.Login1();
	  page.CardNo();
	  page.pin();
	  Thread.sleep(2000);
	  page.robo();
	  Thread.sleep(2000);
	  page.log();
	  Thread.sleep(2000);
	  page.username();
	  Thread.sleep(4000);
	  page.mycards();
	  Thread.sleep(1000);
	  page.viewtransactions();
	  Thread.sleep(1000);
	  driver.close();
  }
  @Test(priority=2)
  public void mytransactions() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\chromedriver_win32.zip");
	  WebDriver driver = new ChromeDriver();
	//navigate to app
	  driver.get("https://www.payback.in/");
	  //maximize the window
	  driver.manage().window().maximize();
	  MyAccountPageFactory page = new MyAccountPageFactory(driver);
	  page.Login1();
	  page.CardNo();
	  page.pin();
	  Thread.sleep(2000);
	  page.robo();
	  Thread.sleep(2000);
	  page.log();
	  Thread.sleep(2000);
	  page.username();
	  Thread.sleep(4000);
	  page.mytransactions();
	  Thread.sleep(1000);
	  page.RedeemCatalogue();
	  Thread.sleep(1000);
	  driver.close();
  }
  @Test(priority=3)
  public void myorder() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\chromedriver_win32.zip");
	  WebDriver driver = new ChromeDriver();
	//navigate to app
	  driver.get("https://www.payback.in/");
	  //maximize the window
	  driver.manage().window().maximize();
	  MyAccountPageFactory page = new MyAccountPageFactory(driver);
	  page.Login1();
	  page.CardNo();
	  page.pin();
	  Thread.sleep(2000);
	  page.robo();
	  Thread.sleep(2000);
	  page.log();
	  Thread.sleep(2000);
	  page.username();
	  Thread.sleep(4000);
	  page.myorder();
	  Thread.sleep(1000);
	  driver.close();
  }
  @Test(priority=4)
  public void logout() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","‪C:\\chromedriver_win32.zip");
	  WebDriver driver = new ChromeDriver();
	//navigate to app
	  driver.get("https://www.payback.in/");
	  //maximize the window
	  driver.manage().window().maximize();
	  MyAccountPageFactory page = new MyAccountPageFactory(driver);
	  page.Login1();
	  page.CardNo();
	  page.pin();
	  Thread.sleep(2000);
	  page.robo();
	  Thread.sleep(2000);
	  page.log();
	  Thread.sleep(2000);
	  page.username();
	  Thread.sleep(4000);
	  page.logout();
	  Thread.sleep(1000);
	  driver.close();
  }
}
