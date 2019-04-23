package ascendlearning.moodle.testscenarios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import ascendlearning.moodle.pages.CourseAdministrationPage;
import ascendlearning.moodle.pages.CoursePage;
import ascendlearning.moodle.pages.HomePage;
import ascendlearning.moodle.pages.LoginPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class Smoke_Test {
	
	LoginPage login;
	HomePage home;
	CoursePage coursePage;
	CourseAdministrationPage courseAdminPage;
	//String captureTextforEnroll;
	
	@Step
	public void loginToApplication() {
		
		login.open();
		login.fillTbxUserNameClear();
		login.fillTbxUserName("himanth.kumar@happiestminds.com");
		login.fillTbxPassword("nasm2016");
		login.clickOnLoginButton();
		
	}
	
	@Step
	public void verifyLoginPage()
	{
		assertTrue(login.loginLogoPresent());
		
	}
	
	@Step
	public void verifyHomePage() 
	{
		assertTrue(home.homePageisDisplay());
	}
	
	@Step
	public void coursePage()
	{
		coursePage.clickOnCourse();
		coursePage.clickOnInternalPage();
		coursePage.clickOnTestingpage();
	}
	
	@Step
	public void verifyTestBCoursePage()
	{
		assertTrue(coursePage.TestBCourseisDisplay());
	}
	
	@Step
	public void clickOnTestCourseExam()
	{
		coursePage.TestBCourseExam();
	}
	
	@Step
	public void clickOnCourseAdminUser()
	{
		courseAdminPage.clickOnUsers();
	}
	@Step
	public void clickOnCourseEnrolledUser()
	{
		courseAdminPage.clickOnEnrolledUser();
	}
	@Step
	public void clickOnCourseEnrolleFordUser() throws InterruptedException
	{
		courseAdminPage.clickEnrollforUsers();
	}
	@Step
	public void clickOnBtnForFinishingEnroll()
	{
		courseAdminPage.clickOnFinishEnroll();
	}
	@Step
	public void enrollUserPage()
	{
		assertTrue(courseAdminPage.enrollUserPage());
	}
	@Step
	public void userPopEnrollPage()
	{
		assertTrue(courseAdminPage.userPopUpEnroll());
	}
	
	@Step
	public void clickUserForEnrollmenet()
	{
		String  captureTextforEnroll=courseAdminPage.captureTextEnolledUser();
		courseAdminPage.clickBtnForEnrolling();
		assertTrue(courseAdminPage.userIsEnrolled());
		courseAdminPage.clickOnFinishEnroll();
		courseAdminPage.searchEnrollUser(captureTextforEnroll);
		courseAdminPage.filterEnrollUser();
		String captureTextforEnrolled=courseAdminPage.captureEnrollText();
		assertThat(captureTextforEnroll.equals(captureTextforEnrolled));
	}

	
	
	
	

}
