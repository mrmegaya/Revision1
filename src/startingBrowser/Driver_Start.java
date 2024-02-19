package startingBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Start {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chromedriver", "F:\\Workspace\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		driver.findElement(By.id("APjFqb")).sendKeys("Megaya"+Keys.ENTER);
		//driver.findElement(By.className("gNO89b")).click();
		//driver.findElement(By.id("APjFqb")).sendKeys("Megaya"+Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();	

	}

}
