package week2.day2.ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Nandini");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Nataru");
		Thread.sleep(2000);
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nandini");
		Thread.sleep(1000); 
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Nataru");
		Thread.sleep(2000); 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT Department");
		driver.findElement(By.id("createContactForm_description")).sendKeys("About technology");
	
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("natarunandini11@gmail.com");
		
		WebElement selectstate = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(selectstate);
		select.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes");
	
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	
	}




	}


