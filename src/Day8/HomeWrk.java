package Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWrk {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		//acceptAlert();
		//CofirmAlertButton();
		PromptAlert();
		//Dismiss();
	
	
}		
	
//	public static void acceptAlert() throws InterruptedException {
//	
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		
//		//go to http://practice.primetech-apps.com/practice/alerts
//		driver.get("http://practice.primetech-apps.com/practice/alerts");
//		
//		//Click on the 'Alert'  button and Accept the alert. 
//		driver.findElement(By.id("alert")).click();
//		Alert button = driver.switchTo().alert();
//		Thread.sleep(1000);
//		button.accept();
//		
//	}		
		
//	public static void CofirmAlertButton() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	
//	
//		//go to http://practice.primetech-apps.com/practice/alerts
//		driver.get("http://practice.primetech-apps.com/practice/alerts");
//		
//		//Click on the 'Confirm Alert' button and Get the text of it. 
//		driver.findElement(By.id("confirm")).click();
//		Alert button = driver.switchTo().alert();
//		Thread.sleep(1000);
//		System.out.println(button.getText());
//		
//		//Then verify if the text equals to "Do you wish to continue or cancel?" then Accept the alert.  If not, cancel the Alert
//		if(button.getText().equals("Do you wish to continue or cancel?")) {
//			System.out.println("Text equals");
//			button.accept();
//		}else {
//			System.out.println("Text not equal");
//			button.dismiss();
//		}
		
		
//	}	
		
	public static void PromptAlert() throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebDriverWait letsWait = new WebDriverWait(driver, 5);
		
		//go to http://practice.primetech-apps.com/practice/alerts
		driver.get("http://practice.primetech-apps.com/practice/alerts");
	
		//Click on the 'Prompt Alert' button and type PrimeTech
		Thread.sleep(1000);
		driver.findElement(By.id("prompt")).click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 600)");
		Thread.sleep(1000);
		Alert type = driver.switchTo().alert();
		type.sendKeys("PrimeTech");
		
		//Then accept the Alert. 
		type.accept();
		
		//Verify that a greeting message displays as "Hello <your input>! How are you today?".
		WebElement message = driver.findElement(By.id("demo"));
		Thread.sleep(1000);
		String greetingText = message.getText();
		if(message.equals("Hello PrimeTech! How are you today?")) {
			System.out.println("Greeting message displayed");
	}	else {
			System.out.println("Greeting message not displayed");
	}
		
		
//	public static void Dismiss() throws InterruptedException {
//			
//			
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//			
//		WebDriverWait letsWait = new WebDriverWait(driver, 5);
//			
//		//go to http://practice.primetech-apps.com/practice/alerts
//		driver.get("http://practice.primetech-apps.com/practice/alerts");
//		
//		//Click on the 'Prompt Alert' button and type PrimeTech. 
//////////		driver.findElement(By.id("prompt")).click();
//		Thread.sleep(1000);
//		Alert dism = driver.switchTo().alert();
//		dism.sendKeys("PrimeTech");
//		
//		//Then dismiss the Alert.
//		dism.dismiss();
//			
//		//Verify that "User cancelled the prompt." text displays.
//		WebElement message = driver.findElement(By.id("demo"));
//		message.isDisplayed();
//		message.getText();
//			
//		}
	}
	
}


