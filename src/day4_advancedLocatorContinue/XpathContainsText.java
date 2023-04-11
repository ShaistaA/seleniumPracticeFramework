package day4_advancedLocatorContinue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		etsyXpath();
	}
	
	public static void etsyXpath() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//Go to etsy.com
		driver.get("https://etsy.com");
		Thread.sleep(1000);
		//Click on Sign in.
		driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]")).click();
		Thread.sleep(1000);
		//Click on Register.
		driver.findElement(By.xpath("//button[contains(text(), 'Register')]")).click();
		Thread.sleep(1000);
		//Enter an email address, (jon.dow@gmail.com)
		driver.findElement(By.xpath("//input[contains(@id, 'email_field')]")).sendKeys("jon.dow@gmail.com");
		//Enter first name.
		driver.findElement(By.xpath("//input[contains(@id, 'first_name_field')]")).sendKeys("jon");
		//Enter password.
		driver.findElement(By.xpath("//input[contains(@id, 'password_field')]")).sendKeys("jondowthe2nd");
		Thread.sleep(1000);
		//Click on Register
		driver.findElement(By.xpath("//button[contains(text(), 'Register')]")).click();
		Thread.sleep(1000);
		//Verify you get the error message:
		//"Sorry, the email you have entered is already in use."
		String errorMsg= driver.findElement(By.xpath("//div[contains(text(), 'already in use.')]")).getText();
		
		if(errorMsg.equals("Sorry, the email you have entered is already in use.")) {
			System.out.println("Test Pass!");
		}else {
			System.out.println("Test Fail!");
	}
	
	
	
	
	}
	
}
