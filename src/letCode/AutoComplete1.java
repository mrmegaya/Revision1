package letCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		WebElement inputclick= driver.findElement(By.xpath("//input[@id='tags']"));
		inputclick.sendKeys("a");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> text=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[starts-with(@id, 'ui-id')]")));
		
		for (WebElement webElement : text) {
			System.out.println("The List for A is :" +webElement.getText());
			}
		Thread.sleep(3000);
		driver.close();
	}

}
