package week2.day2.ass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		driver.findElement(By.id("j_idt87:basic")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.id("j_idt87:j_idt100")).click();
		
		String status = driver.findElement(By.id("j_idt87:j_idt102_input")).getAttribute("aria-disabled");
		System.out.println(status);
		if(status.equalsIgnoreCase("true")) {
			System.out.println("Checkbox disabled");
			
		}else {
			System.out.println("checkbox enabled");
		}
		//driver.quit();
		
		driver.findElement(By.xpath("//ul[@data-label=\"Cities\"]/following::div")).click();
		driver.findElement(By.xpath("//div[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[2]/div/div[2]")).click();
	}

}
