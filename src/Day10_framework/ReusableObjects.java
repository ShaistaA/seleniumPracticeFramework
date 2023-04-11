package Day10_framework;

import org.openqa.selenium.By;

import day2_seleniumFuncitons.FacebookActivities;
import pages.FacebookPage;
import utils.DataReader;
import utils.Driver;

public class ReusableObjects {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		ReusableObjects obj = new ReusableObjects();
		obj.testcase1();
		//obj.testcase2();
	}
	
	FacebookPage fbPage;
	
	public void testcase1() throws InterruptedException {
		
		fbPage = new FacebookPage();
		
		//go to facebook.com
		Driver.getDriver().get(DataReader.getProperty("appUrl"));
		
		//find the Email or phone number field and type Automation
		fbPage.FBemailField.sendKeys(DataReader.getProperty("facebookUsername"));
		
		//find the Password field and type Automation
		fbPage.FBpassField.sendKeys(DataReader.getProperty("facebookPassword"));
		
		//find the Login button and click on it.
		fbPage.FBloginBtn.click();
		Driver.quitDriver();
	}
				
			
	public void testcase2() throws InterruptedException {
		
		//go to facebook.com
		Driver.getDriver().get(DataReader.getProperty("appUrl"));
		//find the Create New Account button and click on it
		Driver.getDriver().findElement(By.linkText("Create new account")).click();
		//find the FirstName, LastName, Email and Password fields and type Automation
		Driver.getDriver().findElement(By.name("firstname")).sendKeys("Automation");
		Driver.getDriver().findElement(By.name("lastname")).sendKeys("Automation");
		Driver.getDriver().findElement(By.name("reg_email__")).sendKeys("Automation");
		Driver.getDriver().findElement(By.name("reg_passwd__")).sendKeys("Automation");
		//find the Sign Up button and click on it.	
		Driver.getDriver().findElement(By.name("websubmit")).click();
		Driver.quitDriver();
	}
	
	

}
