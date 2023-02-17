package week2.day2.ass;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys( "nandhini");
		driver.findElement(By.name("lastname")).sendKeys("nataru");
		driver.findElement(By.name("reg_email__")).sendKeys("nataru.nandhini@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nataru.nandhini@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Testing@456");
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("20");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("3");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1990");
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/span/input")).click();
		
		
		
		
		

}

}
