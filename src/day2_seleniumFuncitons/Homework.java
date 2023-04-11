package day2_seleniumFuncitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		Homework hw = new Homework();
//		hw.Etsy();
		hw.Indeed();
	
	}
		
//		public void Etsy() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		//Go to etsy.com
//		driver.get("https://www.etsy.com/");
//		Thread.sleep(2000);   // this thread sleep is pure Java code, not from selenium
//		//Find Sign in button and click on it
//		driver.findElement(By.className("select-signin")).click();
//		Thread.sleep(2000);
//		//Find email address field and type "automation"
//		driver.findElement(By.name("email")).sendKeys("automation");
//		Thread.sleep(2000);
//		//Find the password field and type "automation"
//		driver.findElement(By.name("password")).sendKeys("automation");
//		Thread.sleep(3000);
//		//Find the sign in button and click on it
//		driver.findElement(By.name("submit_attempt")).click();
//		driver.quit();
//		
//		} 
		
		public void Indeed() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String searchCriteria = "Office";
		
		//1. go to indeed.com
		driver.get("https://indeed.com");
		Thread.sleep(2000);
		//2. get the current URL and store it in a variable called homeURL.
		String homeURL = driver.getCurrentUrl();
		//3. get the website title and store it in a variable homeTitle.
		String homeTitle = driver.getTitle();
		//4. find the input field for WHAT and type SDET
		driver.findElement(By.name("q")).sendKeys(searchCriteria);
		Thread.sleep(3000);
//		driver.findElement(By.className("icl-TextInput-control")).clear();
//		Thread.sleep(2000);
		//5. find the Search button and click on it.
		driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton")).click();
		Thread.sleep(3000);
		//6. get the current URL and store it a variable searchURL.
		String searchURL = driver.getCurrentUrl();
		//7. get the website title and store it in a variable searchTitle.
		String searchTitle = driver.getTitle().toUpperCase();
		//8. verify that searchURL does not equal to homeURL and contains the search criteria.
		if(!searchURL.equals(homeURL) && searchURL.contains(searchCriteria)) {
			System.out.println("URL NOT EQUAL and contains search criteria");
		}else {
			System.out.println("URL EQUAL and does not contain the search criteria");
		}
		//9. verify that searchTitle does not equal to homeTitle and has the search criteria.
		if(!searchTitle.equals(homeTitle) && searchTitle.contains(searchCriteria)) {
			System.out.println("TITLE NOT EQUAL and contains search criteria ");
		}else {
			System.out.println("TITLE EQUAL and does not contain search criteria");
		}
		//10. Get Text of the JobsInLocation field, store it in a variable, then verify if it's equals to your search criteria. 
		String jobsInLocationText = driver.findElement(By.className("jobsearch-SerpTitle")).getText();
		System.out.println("Jobs in the location text: " + jobsInLocationText );
		
		if(jobsInLocationText.contains(searchCriteria)) {
			System.out.println("Jobs in Location Text Contains the search Criteria, Test Pass");
		}else {
			System.out.println("Jobs in Location Text does not Contains the search Criteria, Test fail");
		}
		
		String searchCriteriaSubText = jobsInLocationText.substring(0, searchCriteria.length());
		System.out.println(searchCriteriaSubText + " " + searchCriteria.length());
		
		if(searchCriteriaSubText.equals(searchCriteria)) {
			System.out.println("Jobs in Location Text equals the search Criteria, Test Pass");
		}else {
			System.out.println("Jobs in Location Text does not equals the search Criteria, Test fail");
		}
		driver.quit();
		
		}
	

}
