package day4_advancedLocatorContinue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		etsyCSS();
	}
	
	public static void etsyCSS() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//Go to etsy.com
		driver.get("https://etsy.com");
		Thread.sleep(1000);
		//Click on Sign in.
		driver.findElement(By.cssSelector(".select-signin")).click();
		Thread.sleep(1000);
		//Click on Register.
		driver.findElement(By.cssSelector(".select-register")).click();
		Thread.sleep(1000);
		//Enter an email address, (jon.dow@gmail.com)
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("jon.dow@gmail.com");
		//Enter first name.
		driver.findElement(By.cssSelector("input[name=first_name]")).sendKeys("jon");
		//Enter password.
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("jondowthe2nd");
		Thread.sleep(1000);
		//Click on Register
		driver.findElement(By.cssSelector("button[value=register]")).click();
		Thread.sleep(1000);
		//Verify you get the error message:
		//"Sorry, the email you have entered is already in use."
		String errorMsg= driver.findElement(By.cssSelector("#aria-join_neu_email_field-error")).getText();
		
		if(errorMsg.equals("Sorry, the email you have entered is already in use.")) {
			System.out.println("Test Pass!");
		}else {
			System.out.println("Test Fail!");
	}

	}

}
