package stepDefin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AccountPage;
import pages.SigPage;

public class StepDefi {

	public WebDriver driver;
	@Given("^user goes to Home Page$")
	public void user_goes_to_Home_Page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://Automationpractice.com");
	}
@Given("^I see a logo banner$")
public void i_see_a_logo_banner() throws Throwable {
	
	SigPage sinPage = PageFactory.initElements(driver, SigPage.class);
boolean flag=sinPage.verify_LogoLabel();
	System.out.println(flag);
	Assert.assertTrue(flag);
}
@Given("^I click on Sign in button$")
public void i_click_on_Sign_in_button() throws Throwable {
	SigPage sinPage = PageFactory.initElements(driver, SigPage.class);
			sinPage.click_SignInLink();
			
}

@Given("^I enter my \"([^\"]*)\" in the email text field$")
public void i_enter_my_in_the_email_text_field(String email) throws Throwable {
	AccountPage accountPage = PageFactory.initElements(driver,AccountPage.class);
	accountPage.enter_email(email);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,500)", "");
	  Thread.sleep(3000);
}

@Given("^I enter my \"([^\"]*)\" in my password input box$")
public void i_enter_my_in_my_password_input_box(String password) throws Throwable {
	
	AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
	accountPage.enter_password(password);
}

@When("^I click on Login button$")
public void i_click_on_Login_button() throws Throwable {
	SigPage sigPage = PageFactory.initElements(driver, SigPage.class);
	 sigPage .click_SignInLink();
}

@Then("^I verify that  I am logged in successfully$")
public void i_verify_that_I_am_logged_in_successfully() throws Throwable {

}
}
