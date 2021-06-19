package selenium.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drop_alert {
	WebDriver driver;
	
	public  void DragDrop() {
	
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
	 driver.get("http://demo.guru99.com/test/drag_drop.html");
	 WebElement drag = driver.findElement(By.xpath("//*[text()=' BANK ']")) ;
	 WebElement drop = driver.findElement(By.className("placeholder")) ;	
	 Actions a= new Actions(driver);
	 a.dragAndDrop(drag, drop).build().perform();
	  //driver.payload.wait(TimeUnit,Seconds)
	 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

	 
		
	}
	
	public void alert() {
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		Drop_alert dd=new Drop_alert();
		
		dd. DragDrop();
		dd.alert();
		// TODO Auto-generated method stub

	}

}
