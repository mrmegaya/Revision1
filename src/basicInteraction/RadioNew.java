package basicInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioNew {

	public static void main(String[] args) {
		System.setProperty("WebDriver.ChromeDriver", "/Revision1/exes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		WebElement saf= driver.findElement(By.xpath("//table[@id='j_idt87:console2']//td[3]"));
		String browsername= saf.getText();
		System.out.println("safari browser name : "+browsername);
		String stat= saf.getAttribute("checked");
		System.out.println("Status : "+stat);		
		/*List<WebElement> listelements= driver.findElements(By.xpath("//label[starts-with(@for, 'j_idt87:console2:')]"));
		WebElement checkelement=listelements.get(listelements.size()-1);
		
		for (WebElement webElement : listelements) {
			System.out.println("the element is: "+checkelement);
		}
		int listsize=listelements.size();
		boolean ischecked=false;
		for (int i=0; i<listsize; i++) {				
			ischecked = listelements.get(i).isSelected();
				if (ischecked=true )
				{
				 String namebrowser= listelements.get(i).getText();
				 System.out.println("list "+namebrowser+" "+ischecked);
				}
		}*/
		
		driver.quit();
		
	}

}
