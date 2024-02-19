package letCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		//Enter Details	
		//driver.switchTo().frame(0);		//	switching to frame by index
		//driver.switchTo().frame("firstFr");	//swithing to first frame by ID or Name
		WebElement firstframe= driver.findElement(By.xpath("//iframe[@src='frameUI']")); 	//	switching to frame by Webelement
		driver.switchTo().frame(firstframe);
		WebElement FirstName= driver.findElement(By.xpath("//input[@name='fname']"));
		FirstName.sendKeys("Megaya");
		WebElement LastName= driver.findElement(By.xpath("//input[@name='lname']"));
		LastName.sendKeys("Jesu"); 
		//driver.switchTo().frame(1);
		//driver.switchTo().frame(0).switchTo().frame(1);	//swithing using two switches
		//driver.switchTo().frame(firstframe).switchTo().frame(1);//swithing using webelement and index
		WebElement innerframe= driver.findElement(By.xpath("//iframe[@src='innerFrame']"));// line 15 should be used first
		driver.switchTo().frame(innerframe); // line 15 should be used first
		//driver.switchTo().frame(firstframe).switchTo().frame(innerframe);//stale element reference: stale element not found
		driver.findElement(By.name("email")).sendKeys("megaya@gmail.com");
		driver.switchTo().defaultContent();
		WebElement mainpagetext= driver.findElement(By.xpath("//header[@class='card-header']"));
		System.out.println(mainpagetext.getText());
				
		
		
		//home work alert and frame
		/*driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement tryit=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(tryit);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Megaya");
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//*[@id='demo']")).getText());	
		Thread.sleep(2000);*/
		driver.close();
	}

}
