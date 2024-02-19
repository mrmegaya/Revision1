package letCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkImage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		WebElement image= driver.findElement(By.xpath("(//p[text()='Valid image']/following-sibling::img)[2]"));
		if (image.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is Broken");
		} else {
			System.out.println("The Image is not Broken");
		}
		//element click intercepted so added JavascriptExecutor to scroll down the page a bit
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 450)"); 
		//Valid Link
		WebElement validlink=driver.findElement(By.linkText("Click Here for Valid Link"));
		validlink.click();
		Thread.sleep(3000);
		driver.navigate().back();
		js.executeScript("window.scrollBy(0, 500)"); 
		Thread.sleep(2000);
		WebElement brokenlink= driver.findElement(By.linkText("Click Here for Broken Link"));
		brokenlink.click();
		//Broken Link
		WebElement statuscode= driver.findElement(By.xpath("//div[@class='example']//p[1]"));
		if (statuscode.getText().contains("500")) {
			System.out.println("The Link is Broken");
		} else {
			System.out.println("The Link is not Broken");
		}
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();		
	}

}
