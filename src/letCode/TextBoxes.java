package letCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextBoxes {

	public static void main(String[] args) {		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		//Enter your full Name
		driver.findElement(By.id("fullName")).sendKeys("Megaya Jesu");
		///Append a text and press keyboard tab
		WebElement appendtab= driver.findElement(By.xpath("//input[@id='join' and @value='I am good']"));
		appendtab.sendKeys("TestText");
		appendtab.sendKeys(Keys.TAB);
		//What is inside the text box
		WebElement inside=driver.findElement(By.xpath("//input[@id='getMe']"));
		System.out.println(inside.getText());
		//Clear the text
		WebElement clear=driver.findElement(By.id("clearMe"));
		clear.clear();
		//Confirm edit field is disabled
		WebElement noedit=driver.findElement(By.id("noEdit"));
		Boolean status= noedit.isEnabled();
		System.out.println("IS the Field enabled ? "+status);
		//Confirm text is readonly
		WebElement dontwrite=driver.findElement(By.id("dontwrite"));
		String result= dontwrite.getAttribute("readonly");
		System.out.println(result);
		if (result.equalsIgnoreCase("true")) {
			result="Yes";
		} else {
			result="No";

		}
		System.out.println("IS the Field is readonly ? : "+result +'\n'+"The Text inside the box is : "+dontwrite.getAttribute("value"));
		driver.close();
	}

}
