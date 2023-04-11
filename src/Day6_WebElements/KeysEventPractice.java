package Day6_WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEventPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Coffee Mug" + Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement newSearchBox = driver.findElement(By.name("q"));
		newSearchBox.clear();
		Thread.sleep(1000);
		newSearchBox.sendKeys("Seleniun Webdriver" + Keys.ENTER);
		Thread.sleep(1000);
		
		driver.navigate().back();
		driver.findElement(By.name("q")).clear();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
	
		
		
		
	
	
	
	
	
	
	
	}

}
