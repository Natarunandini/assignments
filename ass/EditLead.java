package week2.day2.ass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	
			
		
			ChromeDriver driver = new ChromeDriver();

			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();

			driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();

			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input[@name='firstName']")).sendKeys("Nandini");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			driver.findElement(By.linkText("10980")).click();
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New company name");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			Thread.sleep(2000); 
			driver.close();

		


	}

}
