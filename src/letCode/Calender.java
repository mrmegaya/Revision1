package letCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		Thread.sleep(3000);
		WebElement calendar= driver.findElement(By.id("datePickerMonthYearInput"));
		calendar.click();
		WebElement next= driver.findElement(By.xpath("//button[text()='Next Month']"));
		next.click();
		WebElement date=driver.findElement(By.xpath("(//div[text()='10'])[1]"));
		date.click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
