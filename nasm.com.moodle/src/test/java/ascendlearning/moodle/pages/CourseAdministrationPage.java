package ascendlearning.moodle.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CourseAdministrationPage extends PageObject {
	
	@FindBy(xpath="//span[contains(text(),'Users')]")
	private WebElementFacade users;
	
	@FindBy(xpath="//span[contains(text(),'Users')]/../../ul/li/p/a[1]")
	private WebElementFacade enrolledUsers;
	
	@FindBy(xpath="//input[1][contains(@value,'Enrol users')]")
	private WebElementFacade enrollForUsers;
	
	@FindBy(xpath="//input[1][@value='Enrol']")
	private WebElementFacade enroll;
	
	@FindBy(xpath="//div[@class='details']/div[2][1][@class='extrafields']")
	private WebElementFacade enrollUserName;
	
	@FindBy(xpath="//input[@value='Finish enrolling users']")
	private WebElementFacade finishEnrolling;
	
//	@FindBy(xpath="//div[1][@class='subfield subfield_email']")
//	private WebElementFacade compareEnrollUser;
	
	@FindBy(xpath="//input[@id='id_search']")
	private WebElementFacade searchEnrollUser;
	
	@FindBy(xpath="//input[@id='id_submitbutton']")
	private WebElementFacade filterEnrollUser;
	
	@FindBy(xpath="//div[@class='subfield subfield_email']")
	private WebElementFacade compareEnrollUser;
	
	@FindBy(xpath="//div/h2[contains(text(),'Enrolled users')]")
	private WebElementFacade enrollUserPage;
	
	@FindBy(xpath="//div/h2[contains(text(),'Enrol users')]")
	private WebElementFacade enrollPopUpPage;
	
	public boolean userIsEnrolled()
	{
		return enroll.isDisplayed();
	}
	
	public boolean enrollUserPage()
	{
		return enrollUserPage.isDisplayed();
	}
	
	public boolean userPopUpEnroll()
	{
		return enrollPopUpPage.isDisplayed();
	}
	
	public void filterEnrollUser()
	{
		filterEnrollUser.click();
	}
	
	public void searchEnrollUser(String SearchUser)
	{
		searchEnrollUser.type(SearchUser);
	}
	
	
	public void clickOnUsers()
	{
		users.click();
	}
	
	public void clickOnEnrolledUser()
	{
		enrolledUsers.click();
	}
	
	public void clickEnrollforUsers() throws InterruptedException
	{
	  
		enrollForUsers.click();
			
	}
	public void clickBtnForEnrolling()
	{
	waitFor(enroll);
	if(enroll.isClickable()) {
		enroll.click();
	}
	}
	public String captureTextEnolledUser()
	{
		waitFor(enrollUserName).isDisplayed();
		
		return enrollUserName.getText();
	}
		
	public void clickOnFinishEnroll()
	{
		finishEnrolling.click();
	}
	
	public String captureEnrollText()
	{
		return compareEnrollUser.getText();
	}

}
