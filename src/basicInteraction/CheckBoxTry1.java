package basicInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTry1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "F:\\Workspace\\chromedriver_winLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		String i = "50";
		WebElement slider=driver.findElement(By.id("j_idt106:slider"));
		slider.sendKeys(i);		
		WebElement slidecheck=driver.findElement(By.xpath("//*[@id=\'j_idt106:j_idt120\']/span"));
		String slidepercent= slidecheck.getDomAttribute(i);
				//getAttribute("style");
		System.out.println(i);
		System.out.println(slidepercent);
		System.out.println("Slide Percent : " +slidepercent.substring(6, 13));
		
		Thread.sleep(2000);
		driver.quit();
//.substring(5, 7)
	}

}
