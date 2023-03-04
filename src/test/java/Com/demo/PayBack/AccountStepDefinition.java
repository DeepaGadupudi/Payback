package Com.demo.PayBack;

import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccountStepDefinition {
	WebDriver driver;
	@Given("User logged into Payback Accountt")
	public void user_logged_into_Payback_Accountt() throws InterruptedException {
	    System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32.zip");
	    driver=new ChromeDriver();
	    //navigate to app
	    driver.get("https://www.payback.in/");
	    //maximize the window
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	  
	}

	@When("User click on the My Profile")
	public void user_click_on_the_My_Profile() throws InterruptedException {
		MyAccountPageFactory page=new MyAccountPageFactory(driver);
		page.Login1();
		page.CardNo();
		page.pin();
		page.robo();
		Thread.sleep(20000);
		page.log();
		Thread.sleep(10000);
		page.username();
		page.myprofile();
		Thread.sleep(1000);
		
	}

	@Then("I should see my details")
	public void i_should_see_my_details() {
		driver.close();
	    
	}

	@Given("User logged into Paybackk Account")
	public void user_logged_into_Paybackk_Account() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32.zip");
	    driver=new ChromeDriver();
	    //navigate to app
	    driver.get("https://www.payback.in/");
	    //maximize the window
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	}

	@When("User click on the My Cards")
	public void user_click_on_the_My_Cards() throws InterruptedException, IOException {
		MyAccountPageFactory page=new MyAccountPageFactory(driver);
		page.Login1();
		page.CardNo();
		page.pin();
		page.robo();
		Thread.sleep(20000);
		page.log();
		Thread.sleep(10000);
		page.username();
		page.mycards();
		Thread.sleep(1000);
		page.viewtransactions();
		Thread.sleep(2000);
		
	}

	@When("User should see my payback card and payback points")
	public void user_should_see_my_payback_card_and_payback_points() throws InterruptedException {
		
	}
	@When("User click on the view Transactions")
	public void user_click_on_the_view_Transactions() {
	}

	@Then("User should be navigate to view Transactions Page")
	public void user_should_be_navigate_to_view_Transactions_Page() {
	    driver.close();
	}

	@Given("User loggedd into payback")
	public void user_loggedd_into_payback() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32.zip");
	    driver=new ChromeDriver();
	    //navigate to app
	    driver.get("https://www.payback.in/");
	    //maximize the window
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	}

	@When("User click on the My Transactions")
	public void user_click_on_the_My_Transactions() throws InterruptedException {
		MyAccountPageFactory page=new MyAccountPageFactory(driver);
		page.Login1();
		page.CardNo();
		page.pin();
		page.robo();
		Thread.sleep(20000);
		page.log();
		Thread.sleep(10000);
		page.username1();
		page.mytransactions();
		Thread.sleep(1000);
		page.RedeemCatalogue();
	}

	@When("User should see my payback point details and Transaction details")
	public void user_should_see_my_payback_point_details_and_Transaction_details() {
	    
	}

	@When("User click on Redeem-Catalogue")
	public void user_click_on_Redeem_Catalogue() {
	}

	@When("User should be navigate to Redeem-Catalogue page")
	public void user_should_be_navigate_to_Redeem_Catalogue_page() {
	    driver.close();
	}


	@Given("User  logged intoo payback")
	public void user_logged_intoo_payback() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32.zip");
	    driver=new ChromeDriver();
	    //navigate to app
	    driver.get("https://www.payback.in/");
	    //maximize the window
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	}

	@When("User click on the My order")
	public void user_click_on_the_My_order() throws InterruptedException  {
		MyAccountPageFactory page=new MyAccountPageFactory(driver);
		page.Login1();
		page.CardNo();
		page.pin();
		page.robo();
		Thread.sleep(20000);
		page.log();
		Thread.sleep(5000);
		page.username();
		Thread.sleep(1000);
		page.myorder();
		Thread.sleep(1000);
		
	}

	@Given("Userr  logged into payback")
	public void userr_logged_into_payback() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_win32.zip");
	    driver=new ChromeDriver();
	    //navigate to app
	    driver.get("https://www.payback.in/");
	    //maximize the window
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	}

	@When("User click on the Logout")
	public void user_click_on_the_Logout() throws InterruptedException {
		MyAccountPageFactory page=new MyAccountPageFactory(driver);
		page.Login1();
		page.CardNo();
		page.pin();
		page.robo();
		Thread.sleep(20000);
		page.log();
		Thread.sleep(10000);
		page.username();
		page.logout();
		Thread.sleep(10000);
	}

	@Then("User Logout from payback Account")
	public void user_Logout_from_payback_Account() {
	   
	}
  }