package petStore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/");
		WebElement copyright=driver.findElement(By.xpath("//*[starts-with(text(),'Copyright')]"));
		String copyinfo= copyright.getText();
		System.out.println("The Copyright Information : "+copyinfo.replace("Copyright ", ""));
		WebElement Enterstore= driver.findElement(By.xpath("//*[contains (text(),'Enter the Store')]"));
		Enterstore.click();
		WebElement Signin=driver.findElement(By.xpath("//a[starts-with(text(),'Sign In')]"));
		Signin.click();
		WebElement register=driver.findElement(By.xpath("//a[starts-with(text(),'Register Now')]"));
		register.click();
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("Megaya");
		WebElement Newpassword= driver.findElement(By.xpath("//input[@name='password']"));
		Newpassword.sendKeys("Megaya"+Keys.TAB);
		WebElement Repeatpassword= driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
		Repeatpassword.sendKeys("Megaya");
		WebElement Firstname= driver.findElement(By.xpath("//input[@name='account.firstName']"));
		Firstname.sendKeys("Megaya");
		WebElement Lastname= driver.findElement(By.xpath("//input[@name='account.lastName']"));
		Lastname.sendKeys("Megaya");
		WebElement Email= driver.findElement(By.xpath("//input[@name='account.email']"));
		Email.sendKeys("Megaya@gmail.com");
		WebElement Phone= driver.findElement(By.xpath("//input[@name='account.phone']"));
		Phone.sendKeys("9600192376");
		WebElement Address1= driver.findElement(By.xpath("//input[@name='account.address1']"));
		Address1.sendKeys("Address 1");
		WebElement Address2= driver.findElement(By.xpath("//input[@name='account.address2']"));
		Address2.sendKeys("Address 2");
		WebElement city= driver.findElement(By.xpath("//input[@name='account.city']"));
		city.sendKeys("Vellore");
		WebElement state= driver.findElement(By.xpath("//input[@name='account.state']"));
		state.sendKeys("TamilNadu");
		WebElement zip= driver.findElement(By.xpath("//input[@name='account.zip']"));
		zip.sendKeys("632602");
		WebElement country= driver.findElement(By.xpath("//input[@name='account.country']"));
		country.sendKeys("India");
		WebElement Languagepreference=driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
		Select select=new Select(Languagepreference);
		select.selectByValue("japanese");
		WebElement favouriteCategoryId= driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
		Select fav= new Select(favouriteCategoryId);
		fav.selectByVisibleText("BIRDS");
		WebElement listOption=driver.findElement(By.xpath("//input[@name='account.listOption']"));
		listOption.click();
		WebElement MyBanner=driver.findElement(By.xpath("//input[@name='account.bannerOption']"));
		MyBanner.click();
		Thread.sleep(3000);
		driver.close();		
	}

}
