package basicInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "F:\\Workspace\\chromedriver_winLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.leafground.com/dashboard.xhtml");
		WebElement selEle= driver.findElement(By.id("menuform:j_idt40"));
		selEle.click();
		WebElement chkbox=driver.findElement(By.id("menuform:m_checkbox"));
		chkbox.click();
		WebElement basic=driver.findElement(By.id("j_idt87:j_idt89"));
		basic.click();
		WebElement ajaxnotification=driver.findElement(By.id("j_idt87:j_idt91"));
		ajaxnotification.click();
		WebElement language=driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		language.click();
		WebElement tristate=driver.findElement(By.id("j_idt87:ajaxTriState"));
		tristate.click();
		Alert alert=driver.switchTo().alert();
		String status= alert.getText();
		System.out.println("the status is : "+status);

	}

}
