package ascendlearning.moodle.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CoursePage extends PageObject {
	
	@FindBy(xpath="//p/a[contains(text(),'Courses')]")
	private WebElementFacade CoursePage;
	
	@FindBy(xpath="//h3/a[contains(text(),'Internal')]")
	private WebElementFacade internalPage;
	
	@FindBy(xpath="//h3/a[contains(text(),'Testing')]")
	private WebElementFacade testingPage;
	
	@FindBy(xpath="//h3/a[contains(text(),'Test Course B (Exam)')]")
	private WebElementFacade testCoursePage;
	
	public void clickOnCourse()
	{
		CoursePage.click();
	}
	
	public void clickOnInternalPage()
	{
		internalPage.click();
		
	}
	public void clickOnTestingpage()
	{
		testingPage.click();
	}
	
	public boolean TestBCourseisDisplay()
	{
		return testCoursePage.isDisplayed();
	}
	
	public void TestBCourseExam()
	{
		testCoursePage.click();
	}
	
	

}
