package ascendlearning.moodle.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject 
{
	@FindBy(xpath="//h2[contains(text(),'Log in')]")
	private WebElementFacade logo;
	
	@FindBy(css="input[name='username']")
	private WebElementFacade userName;
	
	@FindBy(css="input[name='password']")
	private WebElementFacade password;
	
	@FindBy(css="input[id='loginbtn']")
	private WebElementFacade loginbtn;
	
	
	
	public Boolean loginLogoPresent() {
		return logo.isDisplayed();
	}
	public void fillTbxUserNameClear()
	{
		userName.clear();
	}
	
	public void fillTbxUserName(String Username)
	{
		userName.type(Username);
	}
	
	public void fillTbxPassword(String Password) {
		password.type(Password);
	}
	
	public void clickOnLoginButton() {
		loginbtn.click();
		
	}
	

}
