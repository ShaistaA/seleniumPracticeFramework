package Day9;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase1HW {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
	    //go to http://demo.guru99.com/popup.php
		driver.get("http://demo.guru99.com/popup.php");
		
	    //Get title and store it in a variable.
		String mainWindowTitle = driver.getTitle();
		
		//window Id of main page
		String mainWindowId = driver.getWindowHandle();
		System.out.println("mainWindowId: "+mainWindowId);
		
	    //Click on Click Here button
		driver.findElement(By.linkText("Click Here")).click();
		
		//switch over to next window
		Set<String> windowIds = driver.getWindowHandles();
//		//another way
//		for(String windowId : windowIds) {
//			if(windowId.equals(mainWindowId)) {
//				driver.switchTo().window(windowId);
//			}
//			//System.out.println("window id is: "+ windowId);
//		}
		
		Iterator<String> ids = windowIds.iterator();
		String firstWindowId = ids.next();
		String secondWindowId = ids.next();
		
		System.out.println("firstWindowId: " + firstWindowId);
		System.out.println("secondWindowId: " + secondWindowId);
		
		driver.switchTo().window(secondWindowId);
		
		//provide an email click Submit.
		WebElement emailInput = driver.findElement(By.xpath("//input[contains(@name, 'emailid')]"));
		emailInput.sendKeys("shaistaansari@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		
	    //Get text of the user ID and password and store them in variables, print them out. 
		WebElement userId = driver.findElement(By.xpath("//td[contains(text(),'User ID')]/following-sibling::td"));
		System.out.println("userId: " + userId.getText());
		WebElement password = driver.findElement(By.xpath("//td[contains(text(),'Password')]/following-sibling::td"));
		System.out.println("password: " + password.getText());
		//use .trim to remove the spaces before and after password
		
	    //Then verify the text "This access is valid only for 20 days."
		WebElement accessValidText = driver.findElement(By.xpath("//h3[contains(text(), 'This access is valid only for 20 days.')]"));
		String accessValidValue = accessValidText.getText();
		//use if else statement for verify keyword, use getText when it says get
		
	    //Close the window.
		driver.close();
		
	    //Go back to main window
		driver.switchTo().window(firstWindowId);
				
		//get title then verify it equals to your stored title.
		if(driver.getTitle().equals(mainWindowTitle)) {
			System.out.println("Main Window Title is correct");
		}else {
			System.out.println("Main Window Title is incorrect");
		}
		
	    //Quite driver.  
		driver.quit();

	}

}
