package day3_advancedLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		amazonSearch();
	}
		
		public static void amazonSearch() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.com");
			driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("Coffe mug");
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			
		

	}

}
