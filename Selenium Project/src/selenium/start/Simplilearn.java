package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//import org.openqa.selenium.chrome.ChromeDriver;

public class Simplilearn {
	
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver;
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\52101780\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		//driver = new ChromeDriver();
		driver= new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.id("header_srch")).sendKeys("selenium");
		// driver.findElement(By.xpath("//span[@ class='search_icon input-search-icon']")) .click();
		driver.findElement(By.xpath("//span[contains(@class,'search_icon input-search-icon')]")).click() ;
		
		
	    System.out.println("The page tittle is="+ driver.getTitle());
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[contains(text(), 'Selenium 3.0 Training')]")).click();
        // driver.navigate().to("https://www.simplilearn.com/selenium-certification-training?referrer=search&tag=selenium");
         Thread.sleep(3000);
         
       //  driver.get("https://www.amazon.com/");
       //  JavaScriptExecutor js = (JavaScriptExecutor)driver;
        // js.executeScript("windows.scrollBy(0,500)");
      
         
         
	    driver.close();
	    
	
	 
	
		// TODO Auto-generated method stub
	}

}
