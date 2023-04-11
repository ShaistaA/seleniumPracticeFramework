package Day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassHW {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions letsdo = new Actions(driver);
		
		
		// go to "http://practice.primetech-apps.com/practice/drag-and-drop"
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
		
		// Verify Drag And Drop text displays
		if(driver.findElement(By.xpath("//h3[text()='Drag And Drop']")).isDisplayed()) {
			System.out.println("Drag and Drop Title displays");
		}else {
			System.out.println("Drag and Drop doesn't display");
		}
		
		// drag the Text element to target window
		WebElement text = driver.findElement(By.id("text"));
		WebElement dropzone = driver.findElement(By.id("dropzone"));
		letsdo.dragAndDrop(text, dropzone).build().perform();
		
		// drag the Textarea element to target window
		WebElement textArea = driver.findElement(By.id("textarea"));
		WebElement dropzone2 = driver.findElement(By.id("dropzone"));
		letsdo.dragAndDrop(textArea, dropzone2).build().perform();
		
		// drag the Number element to target window
		WebElement number = driver.findElement(By.id("Number"));
		WebElement dropzone3 = driver.findElement(By.id("dropzone"));
		letsdo.dragAndDrop(number, dropzone3).build().perform();
		
		// delete all those dragged items from target window
		List<WebElement> removeButton = driver.findElements(By.cssSelector(".remove"));
		
		for (WebElement webElement : removeButton) {
			webElement.click();
			Thread.sleep(1000);
		}
		
		
		
		

	}

}
