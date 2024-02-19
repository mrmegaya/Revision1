package letCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
		//Take me to dashboard
		WebElement dashboard= driver.findElement(By.linkText("Go to Dashboard"));
		dashboard.click();
		driver.navigate().back();
		//Find my destination
		WebElement destination= driver.findElement(By.partialLinkText("Find the URL"));
		System.out.println("The Destination is : "+destination.getAttribute("href"));
		//Am I broken link?
		WebElement brokenlink= driver.findElement(By.xpath("//a[contains(text(),'Broken?')]"));
		brokenlink.click();
		String title= driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The Link is Broken");
		} else {
			System.out.println("The Link is not Broken");
		}
		driver.navigate().back();
		//Duplicate Link
		WebElement dashboard1= driver.findElement(By.linkText("Go to Dashboard"));
		dashboard1.click();
		driver.navigate().back();
		//Count Links
		List<WebElement> count= driver.findElements(By.tagName("a"));
		System.out.println("Total No of Links are : "+count.size());
		for (WebElement webElement : count) {
			String linkss= webElement.getAttribute("href");
			System.out.println(linkss);
		}
		//Count Layout Links
		List<WebElement> layoutcount=driver.findElements(By.xpath("//div[@class='col-12 md:col-6'][2]/child::div"));
		System.out.println("Size of the second layout links : "+ layoutcount.size());
		for (WebElement webElement : layoutcount) {
			String linkss1=webElement.getAttribute("href");
			System.out.println(linkss1);
		}
		Thread.sleep(3000);
		driver.close();

	}

}
