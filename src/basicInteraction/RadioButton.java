package basicInteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver", "/Revision1/exes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");

		WebElement selEle=driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a"));
		selEle.click(); 
		WebElement	radioselect=driver.findElement(By.id("menuform:m_radio"));
		radioselect.click();
		/*//Step1 favouritebrowser
		WebElement favouritebrowser = driver.findElement(By.xpath(	"//*[@id=\"j_idt87:console1\"]/tbody/tr/td[4]/label"));
		favouritebrowser.click(); 
		System.out.println("Browser is "+favouritebrowser.getText()+" selected"); 
		
		//Step2 UnSelectable
		WebElement chennai =driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/label"));
		chennai.click(); Thread.sleep(1000);
		System.out.println("Chennai is selected"); 
		chennai.click();
		System.out.println("Chennai is UNselected"); */

		// step3
		List<WebElement> browserlist = driver.findElements(By.xpath("//input[starts-with(@id, 'j_idt87:console2:')]"));
		//System.out.println("The list is : " + browserlist);
		//System.out.println("The list size is : " + browserlist.size());
		//table[@id="j_idt87:console1"]//child::div[@class='ui-radiobutton ui-widget']
		//label[starts-with (@for, 'j_idt87:console1:') ]
		//WebElement q;
		for (WebElement currrentlink : browserlist) {
			String selectedstatus=currrentlink.getAttribute("checked");
			System.out.println(selectedstatus);
			
		}
		
		
		/*for (int i = 0; i < browserlist.size(); i++) {
		q = browserlist.get(i);
		//System.out.println(i);
		Boolean selstatus = q.isSelected(); // 
		if(selstatus==true)
		System.out.println(selstatus);
		{
			System.out.println("The selected browser is : " + q.getText() + " " + selstatus);
		}*/
	

	/*
	 * if (sch==true) { System.out.println("Safari is selected"); } else {
	 * System.out.println("Safari is UNselected"); }
	 */
	Thread.sleep(2000);
	/*
	 * List<WebElement> radioButtons =
	 * driver.findElements(By.id("j_idt87:console2")); int size =
	 * radioButtons.size(); String defaultsel=
	 * radioButtons.get(0).getAttribute("checked");
	 * System.out.println("no of buttons is "+size);
	 * System.out.println("default select is : "+defaultsel);
	 * 
	 * // This is the count of total radio button
	 * 
	 * for(WebElement radio : radioButtons1) { If(radio.isSelected()) { String
	 * selectedValue =radio.findElement(By.xpath("./parent::label")).getText(); }
	 * Thread.sleep(2000); driver.close();
	 */
	driver.close();

	}

}
