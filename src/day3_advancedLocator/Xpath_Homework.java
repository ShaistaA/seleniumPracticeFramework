package day3_advancedLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Homework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");

//		Facebook_TestCase1();
	//	Facebook_TestCase2();
		Indeed_TestCase3();

	}
	
//	public static void Facebook_TestCase1() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		
//	    //go to facebook.com
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(1000);
//	    //find the Email or phone number field and type Automation
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Automation");
//		//find the Password field and type Automation
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Automation");
//		Thread.sleep(1000);
//	    //find the Login button and click on it.
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		Thread.sleep(1000);
//		
//	}
//	
//	public static void Facebook_TestCase2() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//    	//go to facebook.com
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(1000);
//    	//find the Create New Account button and click on it
//		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//		Thread.sleep(1000);
//    	//find the FirstName,  LastName, Email and Password fields and type Automation
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Automation");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Automation");
//		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Automation");
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Automation");
//    	//find the Sign Up button and click on it.
//		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//		
//	}
	
	public static void Indeed_TestCase3() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String searchCriteria = "SDET";
		//1. go to indeed.com
		driver.get("https://www.indeed.com/?hl=en&co=us&countrySelector=1");
		//2. get the current URL and store it in a variable called homeURL.
		String homeURL = driver.getCurrentUrl();
		//3. get the website title and store it in a variable homeTitle.
		String homeTitle = driver.getTitle();
		//4. find the input field for WHAT and type SDET
		driver.findElement(By.xpath("//input[@id='text-input-what']")).sendKeys(searchCriteria);
		//5. find the input field for where, clear the field first and type washington DC
		WebElement whereField = driver.findElement(By.xpath("//input[@id='text-input-where']"));
		whereField.sendKeys(Keys.CONTROL + "a");  // select all the text in the box
		whereField.sendKeys(Keys.DELETE);		// deletes the selected text	
		//another way of deleting the text in a box by looping
		//getting the pre existing text in the box using getAttribute method
		// String locationText = whereField.getAttribute("value");
		//for (int i=0; i<locationText.length(); i++){
		//	whereField.sendKeys(Keys.BACK_SPACE);}
		whereField.sendKeys("Washington, DC");
		Thread.sleep(1000);
		//6. find the Search button and click on it.
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		//get the current URL and store it as a variable searchURL.
		String searchURL = driver.getCurrentUrl();
		//7. get the website title and store it in a variable searchTitle.
		String searchTitle = driver.getTitle();
		//8. verify that searchURL does not equal to homeURL and contains the search criteria.
		if(!searchURL.equals(homeURL) && searchURL.contains(searchCriteria)) {
			System.out.println("searchURL does not equal to homeURL and contains the search criteria");
		}else {
			System.out.println("searchURL equals to homeURL and does not contain the search criteria");
		}
		//9. verify that searchTitle does not equal to homeTitle and has the search criteria.
		if(!searchTitle.equals(homeTitle) && searchTitle.contains(searchCriteria)) {
			System.out.println("searchTitle does not equal to homeTitle and contains the search criteria");
		}else {
			System.out.println("searchTitle equals to homeTitle and does not contain the search criteria");
		}
		//10. Get Text of the JobsInLocation field, store it in a variable, 
		String JobsInLocation = driver.findElement(By.className("jobsearch-SerpTitle")).getText();
		//11. then verify if it's equal to your search criteria.
		String subStringCriteria = JobsInLocation.substring(0, searchCriteria.length());
		if(subStringCriteria.equals(searchCriteria)) {
			System.out.println("Jobs in Location Text equals the search Criteria, Test Pass");
		}else {
			System.out.println("Jobs in Location Text does not equals the search Criteria, Test fail");
		}
	}
}
