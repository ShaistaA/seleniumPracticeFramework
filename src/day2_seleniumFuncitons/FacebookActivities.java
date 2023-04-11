package day2_seleniumFuncitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookActivities {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
	
		FacebookActivities fb = new FacebookActivities();
		fb.testcase1();
		fb.testcase2();
	}
		
	public void testcase1() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//go to facebook.com
	driver.get("https://www.facebook.com/");
	//find the Email or phone number field and type Automation
	driver.findElement(By.name("email")).sendKeys("Automation");
	//find the Password field and type Automation
	driver.findElement(By.name("pass")).sendKeys("Automation");
	Thread.sleep(1000);
	//find the Login button and click on it.
	driver.findElement(By.name("login")).click();
	Thread.sleep(1000);
	driver.close();
	}
		
	
	public void testcase2() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	//go to facebook.com
	driver.get("https://www.facebook.com/");
	//find the Create New Account button and click on it
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
	//find the FirstName, LastName, Email and Password fields and type Automation
	driver.findElement(By.name("firstname")).sendKeys("Automation");
	Thread.sleep(1000);
	driver.findElement(By.name("lastname")).sendKeys("Automation");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_email__")).sendKeys("Automation");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_passwd__")).sendKeys("Automation");
	Thread.sleep(1000);
	//find the Sign Up button and click on it.	
	driver.findElement(By.name("websubmit")).click();
	driver.close();
		
	}



	}


