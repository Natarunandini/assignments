package week2.day2.ass;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Nandini");
		driver.findElement(By.id("j_idt88:j_idt91")).clear();
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Chennai");
		boolean disele=driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		if(disele) {
			System.out.println("text box is enabled");
			}
		else {
			System.out.println("text box is disabled");
		}
		
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		driver.findElement(By.id("j_idt88:j_idt97")).sendKeys("My learning is superb so far");
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("nataru.nandhini@gmail.com");
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("my name is nandini iam from chennai");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Test");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys("age is mandatory");
		driver.findElement(By.id("j_idt106:float-input")).sendKeys("check label changes");
		driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("nandini[2]");
	    driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("18/4/1997");
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("2");
		driver.findElement(By.id("j_idt106:slider")).sendKeys("20");
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		driver.findElement(By.id("j_idt106:j_idt124")).click();
		
			
	
	
}

}
