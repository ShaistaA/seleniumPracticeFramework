package Day6_WebElements;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HW {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.primetech-apps.com/practice");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Check Box']")).click();
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		
		List<WebElement> checkBox = driver.findElements(By.tagName("input"));
		System.out.println(Integer.toString(checkBox.size()));
		
		for(WebElement c: checkBox) {
			c.click();
			driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);	
			
		}
		
		
		driver.findElement(By.xpath("//button[text()='Radio Button']")).click();
		driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);	
		
		List<WebElement> radioButton = driver.findElements(By.tagName("input"));
		System.out.println(Integer.toString(radioButton.size()));
		
		for(WebElement r: radioButton) {
			r.click();
			driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);	
		}
		
		
		
		
		driver.findElement(By.xpath("//button[text()='Buttons']")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);	
		
		List<WebElement> DoubleClick = driver.findElements(By.xpath("//button[text()='Double Click Me']"));
		System.out.println(DoubleClick );
		
		List<WebElement> RightClick = driver.findElements(By.xpath("//button[text()='Right Click Me']"));
		System.out.println(RightClick );
		
		List<WebElement> Click = driver.findElements(By.xpath("//button[text()='Click Me']"));
		System.out.println(Click);
		
		
		
		driver.findElement(By.xpath("//button[text()='Links']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);	
		
		List<WebElement> amazon = driver.findElements(By.xpath("//a[@id='amazon'] "));
		System.out.println(amazon);
		
		List<WebElement> Facebook = driver.findElements(By.xpath("//a[@id='facebook'] "));
		System.out.println(Facebook);
	
		
	}



}
