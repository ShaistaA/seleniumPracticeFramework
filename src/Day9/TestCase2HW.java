package Day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2HW {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//go to http://practice.primetech-apps.com/practice/frames
		driver.get("http://practice.primetech-apps.com/practice/frames");
		
		//Verify that there is a page header text as "Frames".
		WebElement frames = driver.findElement(By.xpath("//h3[text()= 'Frames']"));
	//change this part	
        if (frames.getText().equals("Frames")) {
            System.out.println("Header text is correct: " + frames);
        } else {
            System.out.println("Header text is incorrect: " + frames);
        }

		//Find the iFrame element and switch into it
		driver.switchTo().frame("iframe1");
		
		//Find firstname, lastname, address, city, state, and zipcode, and type relative information.
		driver.findElement(By.id("firstName")).sendKeys("Shaista");
		driver.findElement(By.id("lastName")).sendKeys("Ansari");
		driver.findElement(By.id("address")).sendKeys("123 White Street");
		driver.findElement(By.id("city")).sendKeys("Huntsville");
//	    driver.findElement(By.name("state")).sendKeys("Texas");
		
		WebElement state = driver.findElement(By.id("state"));
		Select choose = new Select(state);
		choose.selectByVisibleText("Texas"); // other methods
		//System.out.println(choose.getText());
		
		driver.findElement(By.id("zipCode")).sendKeys("P1d 9g6");
		WebElement gender = driver.findElement(By.id("female"));
		gender.isSelected();
		
		WebElement check = driver.findElement(By.xpath("//label[text()='Check me out']"));
		check.isSelected();
		Thread.sleep(1000);
		
		//Click on submit button.
		WebElement submitBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", submitBTN);
		Thread.sleep(1000);
		//another way
		//wait.until(ExpectedConditions.visibilityOf(submitBTN)).click();
		
		//Verify you see "You have submitted below information:" message.
        boolean infoText = driver.findElement(By.xpath("//h3[text()='You have "
        		+ "submited below information:']")).isDisplayed();
        if (infoText) {
            System.out.println("Message is correct:");
        } else {
            System.out.println("Message text is incorrect:" );
        }
        
		//Switch back to main frame
        driver.switchTo().defaultContent();
        
		//Verify that there is a page header text as "Frames".
        if (frames.getText().equals("Frames")) {
            System.out.println("Header text is correct: " + frames);
        } else {
            System.out.println("Header text is incorrect: " + frames);
        }

	}

}
