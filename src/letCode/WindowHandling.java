package letCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		String Homewindow= driver.getWindowHandle();		
		WebElement OpenHomePage= driver.findElement(By.id("home"));
		OpenHomePage.click();
		Thread.sleep(2000);
		Set<String> NoOfwindows= driver.getWindowHandles();
		//System.out.println(NoOfwindows);
		List<String> list=new ArrayList<String>(NoOfwindows);
		System.out.println(list);
		System.out.println(list.get(1));
		driver.switchTo().window(list.get(1));
		/*for (String newwindow : NoOfwindows) {
			driver.switchTo().window(newwindow);
		}*/		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		//Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(Homewindow);
		//driver.switchTo().defaultContent();
		WebElement multiopen=driver.findElement(By.id("multi"));
		multiopen.click();
		Set<String> list2= driver.getWindowHandles();
		/*for (String openedwindows : multiwindows) {
			if (!openedwindows.equals(Homewindow)) {
				driver.switchTo().window(openedwindows);
				driver.close();	}}*/	
		list.clear();
		list.addAll(list2);
		System.out.println(list);
		System.out.println(list.get(1));
		String thirdwindow=list.get(1);
		Thread.sleep(5000);
		driver.switchTo().window(thirdwindow);
		WebElement  visibletext=driver.findElement(By.id("fruits"));
		Select visible=new Select(visibletext);
		visible.selectByVisibleText("Apple");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(list.get(2));		
		WebElement simplealert= driver.findElement(By.id("accept"));
		simplealert.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(Homewindow);
		Thread.sleep(2000);
		driver.quit();

	}

}
