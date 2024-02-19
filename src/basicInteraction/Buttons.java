package basicInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver", "/Revision1/exes/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		WebElement selEle= driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a"));
		selEle.click();
		WebElement buttonselect=driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a"));
		buttonselect.click();
		WebElement dash=driver.findElement(By.id("j_idt88:j_idt90"));
		String title= dash.getText();
		System.out.println(title);
		dash.click();
		driver.navigate().back();
		WebElement disabledbutton = driver.findElement(By.id("j_idt88:j_idt92"));
		Boolean status= disabledbutton.isEnabled();
		
		if (status==false) {
			System.out.println("The Button is disabled");
		} else {
			System.out.println("The button is ennabled");
		}
		WebElement location=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point xandy= location.getLocation();
		System.out.println("Position of the button is: "+xandy);
		WebElement Buttoncolor=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[1]"));
		String rgba= Buttoncolor.getCssValue("color");
		System.out.println("Buttoncolor is: "+rgba);
		WebElement heightwidth=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[1]"));
		int buttonheight= heightwidth.getSize().height;
		int buttonwidth=heightwidth.getSize().width;
		System.out.println("Button height is :"+buttonheight+" Button Width is :"+buttonwidth);
		WebElement hower=driver.findElement(By.id("j_idt88:j_idt100"));
		Actions howering =new Actions(driver);
		howering.moveToElement(hower).perform();
		System.out.println("Color of a button after mouse hover : " + hower.getCssValue("color"));
		WebElement imagebutton=driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		imagebutton.click();
		WebElement hiddenbutton=driver.findElement(By.id("j_idt88:j_idt107"));
		hiddenbutton.click();		
		Thread.sleep(3000);
		driver.close();

	}

}
