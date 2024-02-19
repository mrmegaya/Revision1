package letCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/selectable");
		List<WebElement> selectlist= driver.findElements(By.xpath("//div[@id='selectable']"));
		Actions actions=new Actions(driver);
		for (WebElement webElement : selectlist) {
			actions.keyDown(Keys.CONTROL).click(webElement).build().perform();
			//actions.clickAndHold(webElement).build().perform();
			System.out.println(webElement.getText()+" Is selected");
		}
		Thread.sleep(5000);
		driver.close();

	}

}
