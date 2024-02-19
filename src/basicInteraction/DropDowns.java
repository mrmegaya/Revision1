package basicInteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "F:\\Workspace\\chromedriver_winLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");		
		WebElement  FavoriteTool=driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
		Select select=new Select(FavoriteTool);
		select.selectByVisibleText("Selenium");	
		WebElement preferredcountry=driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		preferredcountry.click();
		List<WebElement> preflist=driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		for (WebElement webElement : preflist) {
			if (webElement.getText().equals("India")) {
				webElement.click();
				break;
			}
		}
		WebElement langselect=driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']"));
		langselect.click();
		
		List<WebElement> preferredlang=driver.findElements(By.xpath("//ul[@id='j_idt87:lang_items']/li"));
		for (WebElement webElement : preferredlang) {
			if (webElement.getText().equals("Tamil")) {
				webElement.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
