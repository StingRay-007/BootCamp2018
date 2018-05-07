package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStep {

	WebDriver driver;
	
	@Given("^Admin navigate to HRM login page$")
	public void admin_navigate_to_HRM_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/skylynx/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^Admin enter valid usrname and password$")
	public void admin_enter_valid_usrname_and_password() throws Throwable {
		driver.findElement(By.xpath( "//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath( "//input[@id='txtPassword']")).sendKeys("admin");
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath( "//*[@id='btnLogin']")).click();

	}

	@Then("^Admin will land on admin home page$")
	public void admin_will_land_on_admin_home_page() throws Throwable {

		Assert.assertEquals(driver.getCurrentUrl(), "http://opensource.demo.orangehrmlive.com/index.php/dashboard");
		driver.quit();
	}
	

}
