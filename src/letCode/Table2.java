package letCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains (text(),'Customer')]"))).click();
		WebElement selectuser=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='userSelect']")));
		//WebElement selectuser=driver.findElement(By.xpath("//select[@id='userSelect']"));
		Select select=new Select(selectuser);
		select.selectByVisibleText("Ron Weasly");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Custname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='fontBig ng-binding']"))).getText();
		System.out.println("CustName : "+Custname);
		String AccountNum=driver.findElement(By.xpath("(//strong[@class='ng-binding'])[1]")).getText();
		System.out.println("Acount Number : "+AccountNum);		
		String Balance=driver.findElement(By.xpath("(//strong[@class='ng-binding'])[2]")).getText();
		System.out.println("Balance : "+Balance);
		String Currency=driver.findElement(By.xpath("(//strong[@class='ng-binding'])[3]")).getText();
		System.out.println("Currency : "+Currency);	
		//Deposit
		WebElement Deposit=driver.findElement(By.xpath("//button[starts-with(text(),'Deposit')]"));
		Deposit.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='number']"))).sendKeys("255");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String StatusMessage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Deposit Successful')]"))).getText();
		System.out.println("Status : "+StatusMessage);
		
		driver.findElement(By.xpath("//button[starts-with(text(),'Transactions')]")).click();
				//driver.close();
		
	}

}
