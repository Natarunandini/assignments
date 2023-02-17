package week2.day2.ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/select.xhtml");
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.className("ui-selectonemenu"));
			Select dd=new Select(element);
			dd.selectByIndex(1);
			
			
	
			driver.findElement(By.xpath("//label[text()='Select Country']")).click();
			driver.findElement(By.xpath("//li[text()='India']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Select City']")).click();
			driver.findElement(By.xpath("//li[text()='Chennai']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Choose Course']")).click();
			driver.findElement(By.xpath("//label[text()='Select Language']")).click();
			driver.findElement(By.xpath("//li[text()='English']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Select Values']")).click();
			driver.findElement(By.xpath("//li[text()='Two']")).click();	
		

	
	}

}
