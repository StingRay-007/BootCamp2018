package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	//THIS IS HOW TO IMPLIMENT PAGE FACTORY
	
	//username
	@FindBy(how=How.XPATH, using = "//input[@name='txtUsername']")
	@CacheLookup
	WebElement username;
	public WebElement EnterUserName() {
		return username;
	}
	
	//password
	@FindBy(how=How.XPATH, using = "//input[@name='txtPassword']")
	@CacheLookup
	WebElement password;
	public WebElement EnterPassword() {
		return password;
	}
	
	//Login button
	@FindBy(how=How.XPATH, using = "//input[@name='Submit']")
	@CacheLookup
	WebElement login;
	public WebElement LoginButton() {
		return login;
	}
	
	
// THIS IS PAGE OBJECT MODEL	
//	
//	public void EnterUserName() {
//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//	}
//	
//	public void EnterPassword() {
//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
//	}
//	
//	public void LoginButton() {
//		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//	}
//	
	

	
	
	
	
	
	
}
