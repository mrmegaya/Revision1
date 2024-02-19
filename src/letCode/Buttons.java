package letCode;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		//Goto Home and come back here using driver command
		WebElement gotohome= driver.findElement(By.xpath("//button[@id='home']"));
		gotohome.click();
		Thread.sleep(2000);
		driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//Get the X & Y co-ordinates
		WebElement positions=driver.findElement(By.xpath("//button[@id='position']"));
		Point xandy= positions.getLocation();
		System.out.println("Position of x is : "+xandy.getX()+'\n'+"Position of y is : "+xandy.getY());
		//Find the color of the button
		WebElement getcolor=driver.findElement(By.xpath("//button[@id='color']"));
		System.out.println("The color code is : "+getcolor.getCssValue("color"));		
		//Find the height & width of the button
		WebElement property=driver.findElement(By.xpath("//button[@id='property']"));
		System.out.println("Height of Button is : "+property.getSize().getHeight()+'\n'+"Width of Button is : " +property.getSize().getWidth());
		//Confirm button is disabled
		WebElement isdisabled=driver.findElement(By.xpath("//button[@title='Disabled button' and @id='isDisabled']"));
		Boolean status=isdisabled.isEnabled();
		if (status==true) {
			System.out.println("The Button is Disabled");
		} else {
			System.out.println("The Button is Enabled");
		}
		//Click and Hold Button
		WebElement clikhold=driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
		Actions hold=new Actions(driver);
		hold.clickAndHold(clikhold).build().perform();
		Thread.sleep(3000);
		WebElement message=driver.findElement(By.xpath("//h2[text()='Button has been long pressed']"));
		System.out.println(message.getText());
		Thread.sleep(3000);
		driver.close();

	}

}
