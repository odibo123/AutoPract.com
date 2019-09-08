package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SigPage {
	@FindBy(how=How.LINK_TEXT,using = "Sign in")
	public static WebElement SignInlink;
	
	
	
	
	
	
	
	
	//methods
	
	public void click_SignInLink(){
		 SignInlink.click();
		
	}

}
