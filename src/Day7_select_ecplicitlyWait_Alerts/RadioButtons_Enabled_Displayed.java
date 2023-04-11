package Day7_select_ecplicitlyWait_Alerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_Enabled_Displayed {
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
		//go to http://practice.primetech-apps.com/practice/radio-button
		driver.get("http://practice.primetech-apps.com/practice/radio-button");
		
       	//Find those available radio buttons.
		List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-input"));
		Thread.sleep(1000);
		
		
		//Check if it's displayed and enabled
		for(WebElement singleRadio : radioButtons) {
			if(singleRadio.isEnabled() && singleRadio.isDisplayed()) {
				//if true, check if it's selected
				if(singleRadio.isSelected()) {
					System.out.println("Radio Button is Selected");
					//if false select the button
				}else {
					System.out.println("Radio Button is NOT Selected");
			
					singleRadio.click();
					Thread.sleep(1000);
				}
				
			}else {
				System.out.println("Something is not right, Either not displayed or enabled");
			}
			
			Thread.sleep(1000);
			//check if it's selected
			System.out.println("Is radio Button selected? " + singleRadio.isSelected());
			
			
			
			
		}	
			
	
		driver.quit();

	
	
	
	
	

}

}
