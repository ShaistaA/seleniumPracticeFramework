package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class IndeedPage {

	public IndeedPage() {
			PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//onput[@id='test-input-where']")
	public WebElement whereField;
	
	@FindBy (id="text-input-whta")
	public WebElement whatField;
	
	@FindBy (xpath="//button[text()='Search']")
	public WebElement searchtBtn;
	
	@FindBy (linkText = "a//[text()='Upload your resume']")
	public WebElement uploadResumeLink;
}
