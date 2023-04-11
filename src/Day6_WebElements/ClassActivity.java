package Day6_WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

		//Test case 
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		//declare implicitly wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//go to amazon.com
		driver.get("https:amazon.com");
		
		//Search coffee mug.
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Navigate back then search pretty coffee mug.
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pretty Coffee Mug");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		//Navigate back then navigate forward
		driver.navigate().back();
		driver.navigate().forward();
		
		//Refresh the page.
		driver.navigate().refresh();

		
	}

}
