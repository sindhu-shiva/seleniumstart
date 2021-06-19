package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sendthroughjava {
	
	WebDriver driver;
	
	
	public void sendfunction() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value= 'sindhu.shiva89@gmail.com'");
	
	}
	
	public void dropdown() throws InterruptedException {
		
		driver.navigate().to("https://perfectdomain.com/domain/newtour.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.linkText("NEXT")).click();
		WebElement drop=driver.findElement(By.id("sign-up-country"));
		Select dropdown= new Select(drop);
		//dropdown.selectByIndex(11);
		Thread.sleep(2000);
		
		
		//dropdown.selectByValue("100");
		Thread.sleep(2000);
		
		
		dropdown.selectByVisibleText("Pakistan");
		Thread.sleep(2000);
		
	}
	
	
	
		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		sendthroughjava obj= new sendthroughjava();
		obj.sendfunction();
		obj.dropdown();

	}

}
