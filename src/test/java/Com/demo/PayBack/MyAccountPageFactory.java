package Com.demo.PayBack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccountPageFactory {
	WebDriver driver = null;
	@FindBy(xpath="//a[@data-clicktext=\"Login\"]")
	WebElement login;
	@FindBy(xpath="//input[@maxlength=\"16\"]")
	WebElement cardNo;
//	@FindBy(xpath="//a[@class='link pb-gatrack']")
//	WebElement login;
//	@FindBy(xpath="//input[@name='card_number']")
//	WebElement mobilenumber;
	@FindBy(xpath="//input[@placeholder=\"4-Digit PIN\"]")
	WebElement pin;
	@FindBy(xpath="//div[@id='captcha_login_page']")
	WebElement robot;
	@FindBy(xpath="//*[@id=\"pb-login_form\"]/button[2]")
	WebElement log;
	@FindBy(xpath="//a[@class=\"nav-link dropdown-toggle\"]")
	WebElement username;
	@FindBy(xpath="//a[@class=\"pb-my-profile\"]")
	WebElement myprofile;
	@FindBy(xpath="//a[@class=\"nav-link dropdown-toggle\"]")
	WebElement username1;
	@FindBy(xpath="//a[@class='pb-my-cards']")
	WebElement mycards;
	@FindBy(xpath="//a[@class='pb-btn']")
	WebElement viewtransaction;
	@FindBy(xpath="//a[@class=\"nav-link dropdown-toggle\"]")
	WebElement username2;
	@FindBy(xpath="//a[@class='pb-my-transactions']")
	WebElement mytarnsactions;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement RedeemCatalogue;
//	@FindBy(xpath="//a[@href=\"https://www.gyftr.com/payback/singlesign?token=TEMPXYZ786\"]")
//	WebElement RedeemVouchers;
	@FindBy(xpath="//a[@class=\"nav-link dropdown-toggle\"]")
	WebElement username3;
	
	@FindBy(xpath="//a[@class='pb-my-order']")
	WebElement myorder;
	@FindBy(xpath="//a[@class=\"nav-link dropdown-toggle\"]")
	WebElement username4;
	
	@FindBy(xpath="//a[@class='pb-logout']")
	WebElement logout;
	
	public MyAccountPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void Login1()
	{
		login.click();
	}
	public void CardNo() 
	{
		cardNo.click();
		cardNo.sendKeys("9401179105905309");
	}
//	public void paylog()
//	{
//		login.click();
//	}
//	public void MobileNumber()
//	{
//		
//		mobilenumber.sendKeys("6305356455");
//		mobilenumber.click();
//	}
	public void pin() 
	{
		pin.click();
		pin.sendKeys("5845");
		
	}
	public void robo() throws InterruptedException
	{
		robot.click();
		Thread.sleep(10000);
		
	}
	public void log()
	{
		log.click();
	}
	public void username()
	{
		username.click();
	}
	public void myprofile()
	{
		myprofile.click();
		driver.navigate().back();
	}
	public void username1()
	{
		username.click();
	}
	public void mycards()
	{
		mycards.click();
		
	}
	public void viewtransactions()
	{
		viewtransaction.click();
		driver.navigate().back();
	}
	public void username2()
	{
		username.click();
	}
	
	public void mytransactions()
	{
		mytarnsactions.click();
		
	}
	public void RedeemCatalogue()
	{
		RedeemCatalogue.click();
		driver.navigate().back();
	}
//	public void RedeemVouchers()
//	{
//		RedeemVouchers.click();
//		driver.navigate().back();	
//	}
	public void username3()
	{
		username.click();
	}
	
	public void myorder()
	{
		myorder.click();
		driver.navigate().back();
	}
	public void username4()
	{
		username.click();
	}
	public void logout()
	{
		logout.click();

	}
	

}
