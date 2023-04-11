package Day6_WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabledAndDisplayed {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		//go to https://indeed.com
		driver.get("https://indeed.com");
		
		//check if the search fields are enabled and displayed
		WebElement whatField = driver.findElement(By.id("text-input-what"));
		
		WebElement whereField = driver.findElement(By.id("text-input-where"));
		
		
		
		if(whatField.isEnabled() && whatField.isDisplayed()) {
			System.out.println("What Field is enabled and displayed");
		}else {
			System.out.println("What Field is NOT enabled and displayed");
		}
		
		if(whereField.isEnabled() && whereField.isDisplayed()) {
			System.out.println("Where Field is enabled and displayed");
		}else {
			System.out.println("Where Field NOT is enabled and displayed");
		}

		driver.quit();
	
	
	}
	

}
