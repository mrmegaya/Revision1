package letCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		//Select any one
		driver.findElement(By.xpath("//input[@name='answer' and @id='yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='answer' and @id='no']")).click();
		//Cofirm you can select only one radio button
		
		
		

	}

}
