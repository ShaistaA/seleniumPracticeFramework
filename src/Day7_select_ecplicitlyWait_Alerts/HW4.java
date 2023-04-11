package Day7_select_ecplicitlyWait_Alerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4 {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		//  maximize window.
		driver.manage().window().maximize();
		
		//  implicitly wait for 5 seconds.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//  go to ebay.com.   
		driver.get("https://www.ebay.com/");
		
		//  search coffee mug.
		WebElement input = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		input.sendKeys("coffee mug");
		
		WebElement search = driver.findElement(By.cssSelector("input[type=submit]"));
		search.click();
		Thread.sleep(1000);

		
		
		//  find all the results and store them in a list of webelements.
		List<WebElement> searchResults = driver.findElements(By.className("s-item"));
		
		//  loop through all those and get the prices of each item and print it out. 
		for(int i=0; i<searchResults.size(); i++) {
			List<WebElement> price = driver.findElements(By.cssSelector(".s-item__price"));
			System.out.println(price.get(i).getText());
		}
		//  then quit.
		
		driver.quit();

	}

}
