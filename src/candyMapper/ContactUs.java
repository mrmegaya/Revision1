package candyMapper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://candymapper.com/");
		
		WebElement popupclose=driver.findElement(By.xpath("//*[@id='popup-widget46014-close-icon']"));
		popupclose.click();
		driver.get("https://candymapper.com/");
		//element click intercepted so added JavascriptExecutor to scroll down the page a bit
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2500)"); 
		WebElement name=driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_NAME']"));
		name.click();
		Thread.sleep(3000);
		WebElement name1=driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_NAME']"));
		name1.sendKeys("Megaya");
		/*WebElement email2=driver.findElement(By.xpath("//input[starts-with(@data-aid, 'CONTACT_FORM_EMAIL' )]"));
		email2.click();
		email2.sendKeys("megaya@gmail.com");
		WebElement message=driver.findElement(By.xpath("//textarea[@placeholder ='Message']"));
		message.click();
		message.sendKeys("HI and Hello");
		WebElement send=driver.findElement(By.xpath("//button[@data-ux ='ButtonPrimary']"));
		send.click();
		WebElement confirmation=driver.findElement(By.xpath("//*[contains(text(), 'Thank you for your inquiry')]"));
		System.out.println("Succes Message : "+confirmation.getText());*/
		driver.close();
		
		
		

	}

}
