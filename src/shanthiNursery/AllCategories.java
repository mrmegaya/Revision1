package shanthiNursery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCategories {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.santhionlineplants.com/");
		WebElement allcategories= driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		allcategories.click();		
		List<WebElement> categorylist= driver.findElements(By.xpath("//div[@class='categories']/li"));
		int siz=categorylist.size();
		System.out.println("The Size of allcategory is : "+siz+"\n"+"The list are"+'\n'+"--------------------------------------------");
		for (WebElement webElement : categorylist) {
			String list=webElement.getText();
			System.out.println(list);
		}
		Thread.sleep(3000);
		
		WebElement mes= driver.findElement(By.className("slidedown-body-message"));
		System.out.println("The Messgae : "+ mes.getText());
		WebElement cancel=driver.findElement(By.xpath("//button[@class='align-right secondary slidedown-button']"));
		cancel.click();
		Thread.sleep(2000);
		WebElement logoReload = driver.findElement(By.xpath("/html/body/div[6]/div[2]/a/img"));
		logoReload.click();
			
		/*Alert notification=driver.switchTo().alert();
		System.out.println("Notification message is :"+notification.getText());
		notification.dismiss();*/
		Thread.sleep(5000);
		driver.close();
		}

}
