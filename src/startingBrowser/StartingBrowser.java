package startingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartingBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("www.google.com");
		Thread.sleep(5000);
		driver.close();

	}

}
