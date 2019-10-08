package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage {
	
@FindBy(how=How.ID,using ="email")	
public static WebElement EmailBtn;

//@FindBy(how=How.XPATH,using ="//input[@id='passwd']")	
@FindBy(how=How.CSS,using = "#passwd")
public static WebElement PasswordBtn;



public void enter_email(String email){
	
	EmailBtn.sendKeys(email);
}


public void enter_password(String password){
	PasswordBtn.sendKeys(password);
	
}

}
