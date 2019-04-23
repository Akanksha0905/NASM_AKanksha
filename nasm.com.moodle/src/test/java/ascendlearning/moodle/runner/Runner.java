package ascendlearning.moodle.runner;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import ascendlearning.moodle.testscenarios.Smoke_Test;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)
public class Runner {
	
	@Managed(driver = "chrome", uniqueSession=true,  clearCookies = ClearCookiesPolicy.Never)
    WebDriver driver;
	
	@Steps
	 Smoke_Test smokeTest;
	
	@Test
	@Screenshots(onlyOnFailures=true)
	public void A_1_verifyFeaturesLogin_UsernameField(){
		smokeTest.loginToApplication();
		
	}
	@Test
	@Screenshots(onlyOnFailures=true)
	public void B_1_verifyHomePage(){
		smokeTest.verifyHomePage();
		
	}
	@Test
	@Screenshots(onlyOnFailures=true)
	public void C_1_1_clickOnCourse(){
		smokeTest.coursePage();
		
	}
	@Test
	@Screenshots(onlyOnFailures=true)
	public void C_1_2_verifyTestBCourse(){
		smokeTest.verifyTestBCoursePage();
		
	}
	@Test
	@Screenshots(onlyOnFailures=true)
	public void C_1_3_clickOnTestBCourseExam(){
		smokeTest.clickOnTestCourseExam();
		
	}
	@Test
	@Screenshots(onlyOnFailures=true)
	public void D_1_1_verifyEnrollUserPage() throws InterruptedException{
		smokeTest.clickOnCourseAdminUser();
		smokeTest.clickOnCourseEnrolledUser();
		smokeTest.enrollUserPage();
	}
	@Test
	@Screenshots(onlyOnFailures=true)
	public void D_1_2_verifyEnrollPopUpPage() throws InterruptedException
	{
		smokeTest.clickOnCourseEnrolleFordUser();
		smokeTest.userPopEnrollPage();
		
	}
	@Test
	@Screenshots(onlyOnFailures=true)
	public void D_1_3_verifyUserEnrolledAndUserTextAdded() throws InterruptedException
	{	
	
		smokeTest.clickUserForEnrollmenet();
	
	}
	
	

}
