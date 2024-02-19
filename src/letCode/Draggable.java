package letCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement dragelement= driver.findElement(By.id("draggable"));
		//WebElement container=driver.findElement(By.className("example-boundary"));
		org.openqa.selenium.Point xandy= dragelement.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		Actions dragging=new Actions(driver);
		//dragging.dragAndDrop(dragelement, container).build().perform();
		dragging.dragAndDropBy(dragelement, x+9, y+9).build().perform();
		System.out.println("Dragging complete");
		Thread.sleep(3000);
		driver.close();

	}

}
