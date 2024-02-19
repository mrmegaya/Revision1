package letCode;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/file");
		WebElement execel= driver.findElement(By.xpath("//a[contains(text(), 'Download Excel')]"));
		execel.click();		
		Thread.sleep(2000);
		File filelocation=new File("C:\\Users\\megay\\Downloads");
		File[] totalfiles= filelocation.listFiles();
		for (File file : totalfiles) {
			if (file.getName().contains("sample.xlsx")) {
				System.out.println("The Excel File is Downloaded.");
				break;
			} 
		}
		WebElement pdf=driver.findElement(By.xpath("//a[@id='pdf']"));
		pdf.click();
		Thread.sleep(2000);
		File[] totalPDFfiles= filelocation.listFiles();
		for (File file : totalPDFfiles) {
			if (file.getName().contains("sample.pdf")) {
				System.out.println("The PDF File is Downloaded.");
				break;
			} 
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)"); 
		WebElement txt=driver.findElement(By.xpath("//a[@id='txt']"));
		txt.click();
		Thread.sleep(2000);
		File[] totalTXTfiles= filelocation.listFiles();
		for (File file : totalTXTfiles) {
			if (file.getName().contains("sample.txt")) {
				System.out.println("The TEXT File is Downloaded.");
				break;
			} 
		}
		//			C:\Users\megay\Downloads\sample.txt
		driver.get("https://www.leafground.com/file.xhtml");
					
		// Specify the file location with extension
        String filePath = "C:\\Users\\megay\\Recent\\sample.txt"; // Replace with your file path

        // Copy the file path to the clipboard
        StringSelection sel = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

        // Open the webpage where you want to upload the file
        WebElement upload= driver.findElement(By.xpath("//span[@id='j_idt88:j_idt89']")); // Replace with the actual locator
        upload.click();
 
        // Create an instance of Robot class
        Robot robot = new Robot();

        // Simulate keyboard events
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Wait for the upload process (optional)
        //Thread.sleep(5000); // Adjust the delay as needed

        

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//span[@class='ui-fileupload-filename']"))));
		WebElement result=driver.findElement(By.xpath("//span[@class='ui-fileupload-filename']"));
		System.out.println("File is Uploaded : "+result.getText());
		driver.close();
        driver.quit();// Close the browser*/

	}

}
