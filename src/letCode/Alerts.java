package letCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		//Accept the Alert
		WebElement alertaccept= driver.findElement(By.xpath("//button[@id='accept']"));
		alertaccept.click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println(alerttext);
		alert.accept();
		WebElement confirmalert=driver.findElement(By.xpath("//button[@id='confirm']"));
		confirmalert.click();
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		confirmalert.click();
		Thread.sleep(2000);
		alert.dismiss();
		WebElement promptalert=driver.findElement(By.xpath("//button[@id='prompt']"));
		promptalert.click();
		Thread.sleep(2000);
		alert.sendKeys("Megaya");
		alert.accept();
		String text=driver.findElement(By.xpath("//*[@id='myName']")).getText();
		System.out.println(text);
		driver.close();

	}

}
