package day4_advancedLocatorContinue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shaista\\Documents\\SeleniumTools\\ChromeDriver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
	
//1. Go to http://practice.primetech-apps.com/practice/web-tables
		driver.get("http://practice.primetech-apps.com/practice/web-tables");
		
//2. Verify that you see Web Tables text
		String webtable = driver.findElement(By.xpath("//h3[text()='Web Tables']")).getText();
		if(webtable.equals("Web Tables")) {
			System.out.println("Web Tables is visible");
		}
		else {
			System.out.println("Do not see web tables");
		}
		
//3. Find id, firstname, lastname, salary fields and give a relevant input. (store the information into variables, then pass the variable to sendKeys() method) 
		int id = 123;
		String firstname = "Shaista";
		String lastname = "Ansari";
		int salary = 1300;
		double salary2 = 1300.00;
		
		driver.findElement(By.xpath("//input[@id= 'Id']")).sendKeys(String.valueOf(id));
		driver.findElement(By.xpath("//input[@id= 'First Name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id= 'Last Name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id= 'Salary']")).sendKeys(String.valueOf(salary));
		Thread.sleep(2000);
		
//4. Click on Add button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
////5. Then your inputs will display under the table. (use xpath text() contains() functions to locate those elements. get text and store them into variables)
//		String actualId = driver.findElement(By.xpath("//td[text()='" + id + "']")).getText();
//		System.out.println("acutalId");
//		String actualFistName = driver.findElement(By.xpath("//td[text()='" + firstname + "']")).getText();
//		System.out.println("actualFirstaName");
//		String actualLastName = driver.findElement(By.xpath("//td[text()='" + lastname + "']")).getText();
//		System.out.println("actualLastName");
//		String actualSalary = driver.findElement(By.xpath("//td[text()='" + salary + "']")).getText();
//		System.out.println("actualSalary");
		
//6. Verify your input under the table match the input you added. 
		
//		if(actualId.equals(id)) {
//			System.out.println("ID is good, Test Pass!");
//			
//		}else {
//			System.out.println("ID is not good");
//		}
		
		
		
	}

}
