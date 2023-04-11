package SeleniumReview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Lionel Messi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[text()='Search']")).click();
		Thread.sleep(1000);
		
		String name = driver.findElement(By.xpath("//span[text()='Lionel Messi']")).getText();
		System.out.println(name);
		
		
		//span[text()='Lionel Messi']
		
		
		
	}

}
