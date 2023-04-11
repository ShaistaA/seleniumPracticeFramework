package day4_advancedLocatorContinue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOrCss_Homework {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//(Create variables for those information and pass the variable to the sendkey() method).
		String expectedFirstName = "Shaista";
		String expectedLastName = "Ansari";
		String expectedEmail = "abc123@gmail.com";
		String expectedPassword = "fda12@11";
		String expectedAddressField = "123 Mackenzie Drive";

		//Go to http://practice.primetech-apps.com/practice/text-box
		driver.get("http://practice.primetech-apps.com/practice/text-box");
		Thread.sleep(1000);
		
		//Find first name, last name, email, password, address fields, and type relevant information. 
		driver.findElement(By.cssSelector("#firstName")).sendKeys(expectedFirstName);
		driver.findElement(By.cssSelector("#lastName")).sendKeys(expectedLastName);
		driver.findElement(By.cssSelector("#email")).sendKeys(expectedEmail);
		driver.findElement(By.cssSelector("#password")).sendKeys(expectedPassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(), 'Enable')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#address")).sendKeys(expectedAddressField);
		
		//Then click on submit button. (your inputs displays under user info section).
		driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
		Thread.sleep(1000);
		
		//Find your inputs and get text of each and store them into variables.
		String actualFirstName = driver.findElement(By.xpath("//div[@class='firstName']")).getText();
		String actualLastName = driver.findElement(By.xpath("//div[@class='lastName']")).getText();
		String actualEmail = driver.findElement(By.xpath("//div[@class='email']")).getText();
		String actualPassword = driver.findElement(By.xpath("//div[@class='password']")).getText();
		String actualAddressField = driver.findElement(By.xpath("//div[@class='address']")).getText();
		
		//Then compare your input with the displayed user information if they match.
		if(expectedFirstName.equals(actualFirstName)) {
			System.out.println("Expected First Name, Passed!");
		}else {
			System.out.println("Unexpected First Name, Failed!");
		}
		
		if(expectedLastName.equals(actualLastName)) {
			System.out.println("Expected Last Name, Passed!");
		}else {
			System.out.println("Unexpected Last Name, Failed!");
		}
		
		if(expectedEmail.equals(actualEmail)) {
			System.out.println("Expected Email, Passed!");
		}else {
			System.out.println("Unexpected Email, Failed!");
		}
		
		if(expectedPassword.equals(actualPassword)) {
			System.out.println("Expected Password, Passed!");
		}else {
			System.out.println("Unexpected Password, Failed!");
		}
		
		if(expectedAddressField.equals(actualAddressField)) {
			System.out.println("Expected AddressField, Passed!");
		}else {
			System.out.println("Unexpected AddressField, Failed!");
		}
		
	}

}
