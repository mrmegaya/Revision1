package basicInteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroedriver", "F:\\Workspace\\chromedriver_winLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		Thread.sleep(3000);
		driver.close();

	}

}
