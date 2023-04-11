package Day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
			//printAllOptions();
			Amazon();
}
	
	
//	public static void printAllOptions(){
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//	    //go to amazon.com 
//		driver.get("https://www.amazon.com/");
//		
//	    //get all the options in the departments select dropdown
//		WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
//		Select choose = new Select(selectElement);
//		
//		//verify there are total 28 departments. And print them out.
//		List<WebElement> allOptions = choose.getOptions();
//		System.out.println(allOptions.size());
//		for(WebElement printOptions : allOptions) {
//			System.out.println(printOptions.getText());
//		}
//		
//		driver.quit();
//	}
		
	    
	
	public static void Amazon() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
			
		//go to amazon.com 
		driver.get("https://www.amazon.com/");
	   
	    //verify that you are on the amazon home page. (verify with title). 
		if(driver.getTitle().equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("User is on Amazon Home Page");
		}else {
			System.out.println("User is not on Amazon Home Page");
		}
		
	    //verify dropdown value is by default "All Departments"
		String defaultDropDownValue = "All Departments";
		
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		
		Select letsSelect = new Select(dropDown);
		
		String acutalSelectedOption = letsSelect.getFirstSelectedOption().getText();
		
		if(acutalSelectedOption.equals(defaultDropDownValue)) {
			System.out.println("dropdown matches");
		}else {
			System.out.println("dropdown does not match");
		}
		
	    //select department Home & Kitchen, and search coffee mug.
		String searchItem = "Coffee Mug";
		letsSelect.selectByVisibleText("Home & Kitchen");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	    // verify you are on coffee mug search results page (use title).
		String ItemPageTitle = driver.getTitle();
		int beginningIndex = ItemPageTitle.length() - searchItem.length();
		System.out.println(beginningIndex);
		if(ItemPageTitle.substring(beginningIndex).equals(searchItem)) {
			System.out.println("Search item title match");
		}else {
			System.out.println("Search item title does not match");
		}
		
	    //verify you are in Home & Kitchen department.
		WebElement dropDown2 = driver.findElement(By.id("searchDropdownBox"));
		
		Select letsSelect2 = new Select(dropDown2);
		
		String selectedOption = letsSelect2.getFirstSelectedOption().getText();
		if(selectedOption.equals("Home & Kitchen")) {
			System.out.println("Test pass");
		}else
			System.out.println("Test fail");
	}

		
		
		
		
		
			
		

	}

