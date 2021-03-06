package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SigPage {
	@FindBy(how=How.LINK_TEXT,using = "Sign in")
	public static WebElement SignInlink;
	
	
	@FindBy(how=How.XPATH,using = "//img[@class='logo img-responsive']")
	public static WebElement LogoLabel;
	
	//@FindBy(how=How.CSS,using = "#passwd")
	//public static WebElement LogoLabel;
	//methods
	
	public void click_SignInLink(){
		 SignInlink.click();
		
	}

	/*public void verify_LogoLabel(){
		LogoLabel.isDisplayed();
		
	}*/
	public boolean verify_LogoLabel(){
		return LogoLabel.isDisplayed();
}
}