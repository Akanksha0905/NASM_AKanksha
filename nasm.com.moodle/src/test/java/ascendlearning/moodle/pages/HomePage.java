package ascendlearning.moodle.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
	
	@FindBy(xpath="//h1[contains(text(),'Home: My home')]")
	private WebElementFacade homePage;
	
	public boolean homePageisDisplay()
	{
		return homePage.isDisplayed();
	}

}
