package selenium.start;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class Scrolling {
	
	WebDriver driver;
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	public void scroll() {
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	       JavascriptExecutor js = (JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,1000);");
	}
	
	/*public void assertFunction() {
		String actual= driver.getTitle();
		String expected= "abcgdef";
		
		
	Assert.assertEquals(actual, expected); 
	}*/
	
	public void mousehover() throws InterruptedException {
	 driver.navigate().to("https://www.ebay.com/");
	 WebElement w= driver.findElement(By.linkText("Electronics"));
	 Actions act= new Actions(driver);
	 act.moveToElement(w).build().perform();
	 Thread.sleep(4000);
	}
	
	public void close() {
		
		driver.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Scrolling obj = new Scrolling();
		obj.launch();
		obj.scroll();
		obj.mousehover();
		obj.close();
		
		//obj.assertFunction();
		// TODO Auto-generated method stub

	}

}
