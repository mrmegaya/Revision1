package letCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chromedriver", "/Revision1/exes/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		//using visible text
		WebElement  visibletext=driver.findElement(By.id("fruits"));
		Select visible=new Select(visibletext);
		visible.selectByVisibleText("Apple");
		//super hero's
		WebElement superheros=driver.findElement(By.id("superheros"));
		Select heros=new Select(superheros);
		Boolean ismultiple= heros.isMultiple();
		System.out.println("Is SuperHeros drop down Multiselect : "+ismultiple);
		heros.selectByIndex(2);
		heros.selectByValue("am");
		heros.selectByVisibleText("Batman");
		Thread.sleep(3000);
		heros.deselectAll();
		//last programming language
		List<WebElement> lang=driver.findElements(By.xpath("//select[@id='lang']//option"));
		System.out.println(lang.size());
		for (WebElement webElement : lang) {
			System.out.println(webElement.getText());
		}
		
		int si=lang.size()-1;
		WebElement language=driver.findElement(By.xpath("//select[@id='lang']"));
		Select langu=new Select(language);
			
		langu.selectByIndex(si);
		//Select India using value & print the selected value
		WebElement india=driver.findElement(By.xpath("//select[@id='country']"));
		Select country=new Select(india);
		country.selectByValue("India");
		String nameofcountry= country.getFirstSelectedOption().getText();
		System.out.println(nameofcountry);
		

	}

}
