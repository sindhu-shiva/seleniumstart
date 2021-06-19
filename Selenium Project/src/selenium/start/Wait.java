 package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {
	
	WebDriver driver;
	
	public void waitimplicit() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		WebElement e= driver.findElement(By.xpath("//span[@title='All Courses']"));
		Actions a = new Actions (driver);
		a.moveToElement(e).perform();
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);(Any 1 wait will be fine)
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement f= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		WebElement p= driver.findElement(By.name("pass"));
		
		
		sendkeys(driver,f,20,"a@b.com");
		sendkeys(driver,p,20,"password123");
		
		WebElement l= driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		clickKeys(driver,l,20);
		
		WebElement fp= driver.findElement(By.xpath("//a[@class='_97w4']"));
		clickKeys(driver,fp,25);

	}
	
	public void sendkeys(WebDriver driver, WebElement element ,int  Timeout , String Value )
	{
		WebDriverWait wait= new WebDriverWait(driver, Timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Value);
	}
	
	public void clickKeys(WebDriver driver, WebElement element ,int  Timeout)
	{
		WebDriverWait wait= new WebDriverWait(driver, Timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void main(String[] args) throws InterruptedException {
		Wait w= new Wait();
		w.waitimplicit();
		// TODO Auto-generated method stub

	}

}
