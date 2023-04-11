package Day7_select_ecplicitlyWait_Alerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes_Enabled_Displayed_Selected {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//go to http://practice.primetech-apps.com/practice/check-box
		driver.get("http://practice.primetech-apps.com/practice/check-box");
		
		
		//find the checkboxes
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector(".form-check-input"));
		
		
		for(WebElement check: checkBoxes) {
			//verify if it’s displayed
			if(check.isDisplayed()) {
				System.out.println("Check Box is Displayed");
				//if true, then verify if it’s enabled
				if(check.isEnabled()) {
					System.out.println("Check Box is Enabled");
					//if true, verify if it’s selected
					if(check.isSelected()) {
						System.out.println("Check Box is Selected");
					}else {
						//if false, then check the boxes
						System.out.println("Check Box is checked because it was not selected");
						check.click();
						Thread.sleep(1000);
					}
				}else {
				System.out.println("Check Box is not enabled");
				}	
			}else {
				System.out.println("Check Box is not Displayed");
			}
			
		//verify if it’s checked
			System.out.println("Is checked " + check.isSelected());
	}
		
	
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
