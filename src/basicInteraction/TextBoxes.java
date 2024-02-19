package basicInteraction;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "F:\\Workspace\\chromedriver_winLatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.leafground.com/dashboard.xhtml");
		WebElement selEle= driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a"));
		selEle.click();
		WebElement tbox=driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a"));
		tbox.click();
		//Type your name
		WebElement typename=driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		typename.sendKeys("Megaya");
		//Append Country 
		WebElement appendcontry=driver.findElement(By.id("j_idt88:j_idt91"));
		appendcontry.sendKeys("Appendedtext");
		//Verify if text box is disabled
		WebElement verify=driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean status= verify.isEnabled();
		if (status==false) {
			System.out.println("The Button is disabled");
		} else {
			System.out.println("The button is ennabled");
		}
		//Clear the typed text.
		WebElement clearfield=driver.findElement(By.id("j_idt88:j_idt95"));
		clearfield.clear();
		//Retrieve the typed text.
		WebElement retrive=driver.findElement(By.id("j_idt88:j_idt97"));
		String retrived= retrive.getAttribute("value");
		System.out.println("retrived text is : "+retrived);
		//Type email and Tab
		WebElement andtab=driver.findElement(By.id("j_idt88:j_idt99"));
		andtab.sendKeys("Megaya.com");
		andtab.sendKeys(Keys.TAB);
		Boolean selec= andtab.isSelected();
		if (selec==false) {
			System.out.println("Tab Confirmed");
		} else {
			System.out.println("tab not confirmed");
		}
		//Type about yourself
		WebElement yourself=driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
		yourself.sendKeys("about yourself");
		
		//Text Editor
		WebElement editor=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]"));
		editor.sendKeys("Everything seems in perfect sync and ideally should have worked out of the box.");
		//Just Press Enter and confirm error message
		driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement errormessage= driver.findElement(By.xpath("//*[contains (text(), 'Age is mandatory')]"));
		boolean dispstat=errormessage.isDisplayed();
		if (dispstat==true) {
			System.out.println("The error message Age is mandatory is displayed");
		}
		//Click and Confirm Label Position Changes
		/*WebElement LabelPositionChange= driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
		Point points= LabelPositionChange.getLocation();
		System.out.println(points);
		LabelPositionChange.click();
		Point Newposition= LabelPositionChange.getLocation();
		System.out.println(Newposition);*/
		
		//Thread.sleep(2000);
		//Type your name and choose the third option
		WebElement auto= driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
		auto.sendKeys("Megaya");
		Thread.sleep(2000);
		List<WebElement> lilist= driver.findElements(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li"));
		for (WebElement webElement : lilist) {
			
			if (webElement.getText().equals("Megaya2")) {
				webElement.click();
				break;
			}
			
		}
		System.out.println("choose the third option success");
		//Slider conform
		WebElement slider=driver.findElement(By.id("j_idt106:slider"));
		slider.sendKeys("30");
		
		WebElement slidecheck=driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default"));
		String slidepercent= slidecheck.getAttribute("style");
		System.out.println(slidepercent.subSequence(5, 7));
		
		Thread.sleep(3000);
		//driver.close();

	}

}

