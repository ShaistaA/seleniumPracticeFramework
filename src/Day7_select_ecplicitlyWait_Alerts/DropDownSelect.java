package Day7_select_ecplicitlyWait_Alerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// go to amazon, 
		driver.get("https://amazon.com");
		
		//and select Home & Kitchen option from the dropdown
		WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
		Select choose = new Select(selectElement);
		
		WebElement firstSelectedOption = choose.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		choose.selectByVisibleText("Home & Kitchen");
		Thread.sleep(1000);
		choose.selectByIndex(2);
		Thread.sleep(1000);
		choose.selectByValue("search-alias=stripbooks");
		
		System.out.println(choose.getFirstSelectedOption().getText());
		
		List<WebElement> allOptions = choose.getOptions();
		System.out.println(allOptions.size());
		for (WebElement element : allOptions) {
			System.out.println(element.getText());
	}

}
}