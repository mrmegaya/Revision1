package basicInteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioloop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver", "/Revision1/exes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		List<WebElement> elementslist=driver.findElements(By.xpath("//label[starts-with(@for, 'j_idt87:console2:')]"));
		//System.out.println(elementslist);
		/*
		 * for (WebElement webElement : check1) { String selected=
		 * webElement.getAttribute("checked"); System.out.println(selected);}
		 */		
			int siz=elementslist.size();
			 boolean ischecked=false;
			 for (int i = 0; i < siz; i++) {
				 WebElement checkedelement;
				 checkedelement = elementslist.get(i);
				 ischecked =checkedelement.isSelected();
				 /* if (checkedelement.isSelected()==true )
				 {
					  WebElement ancestor=driver.findElement(By.xpath(""))
					  String labels=checkedelement.getAttribute("label"); //checkedlist.get(i);
				 System.out.println("The selected is "+labels);
				 //if (selected.equals("true")) {  
				 }	*/	
				 if (checkedelement.isSelected()==true )
				 {
				 System.out.println("list "+checkedelement+" "+ischecked);
				 }
		}
		//Thread.sleep(2000);
		driver.close();
	}
}
