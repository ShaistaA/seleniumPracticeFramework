package Day8;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//go to http://practice.primetech-apps.com/practice/browser-windows
		driver.get("http://practice.primetech-apps.com/practice/browser-windows");
		
		//1. Get the main window ID and store it in a String called mainWindowId, 
		String mainWindowId = driver.getWindowHandle();
		System.out.println("main window id: " + mainWindowId);
		
		//2. Click on the 'New Tab' button
		driver.findElement(By.id("newTab")).click();
		
		//3. Get window IDs and store it into a Set
		Set<String> windowIDs = driver.getWindowHandles();
		for(String windowID: windowIDs) {
			System.out.println("Window Id is: " + windowID);
		}
		//4. Get the first window ID from the Set
		Iterator<String> ids = windowIDs.iterator();
		String firstwindowId = ids.next();
		
		//Verify it matches with the main window id in step 1. 
		if(firstwindowId.equals(mainWindowId)) {
			System.out.println("First window id match the main window id");
		}else {
			System.err.println("First window id does not match the main window id");
		}
		
		//Then get the second window id and store it in variable called secondWindowId.
		String secondWindowId = ids.next();
		
		//5. Switch to the second window
		driver.switchTo().window(secondWindowId);
		
		//6. Verify that there is a button called 'New Tab'
		if(driver.findElement(By.id("newTab")).isDisplayed()) {
			System.out.println("New tab is avaiable on second window");
		}else {
			System.out.println("New tab is not available on the second window");
		}
		
		//7. Close the window,  Switch back to the main window
		driver.close();
		
		driver.switchTo().window(firstwindowId);
		
		//Verify you are on the main window. 
		if (driver.getWindowHandle().equals(mainWindowId)) {
			System.out.println("User is on the main window");
		}else {
			System.out.println("User is Lost");
		}

}


	

}
