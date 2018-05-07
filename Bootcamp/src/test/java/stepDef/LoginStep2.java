package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import AllBrowsers.BrowserInitialize;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep2 {

	WebDriver driver;
	BrowserInitialize br;
	LoginPage lp;
	
	
	@Given("^Admin navigate to HRM loginpage$")
	public void admin_navigate_to_HRM_loginpage() throws Throwable {
	    br = new BrowserInitialize();
	    driver=br.ChooseBrowser();
	
	}

	@When("^Admin enter validusrname and password$")
	public void admin_enter_validusrname_and_password() throws Throwable {
	    lp = new LoginPage(driver);
	    lp.EnterUserName().sendKeys("Admin");
	    lp.EnterPassword().sendKeys("admin");
	    
	}

	@When("^click on loginbutton$")
	public void click_on_loginbutton() throws Throwable {
	    lp = new LoginPage(driver);
	    lp.LoginButton().click();
	    
	}

	@Then("^Admin will land on admin homepage$")
	public void admin_will_land_on_admin_homepage() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		driver.quit();
	    
	}
	
}//end class
