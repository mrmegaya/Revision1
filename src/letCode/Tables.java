package letCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/SearchFilter/");
		List<WebElement> columncount=driver.findElements(By.tagName("th"));
		System.out.println("columncount :"+columncount.size());
		List<WebElement> rowcount=driver.findElements(By.tagName("tr"));
		System.out.println("rowcount :"+rowcount.size());
		WebElement houserent= driver.findElement(By.xpath("//td[text()='HouseRent']//following::td[1]"));
		System.out.println("The House rent is :" + houserent.getText());
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
