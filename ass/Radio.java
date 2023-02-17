package week2.day2.ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='card']//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[1]")).click();
				
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		WebElement status = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		System.out.println("Default browser selected : "+status.getText());
		
        WebElement age = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
        System.out.println("Default age group selected : "+age.getText());
	}

}
