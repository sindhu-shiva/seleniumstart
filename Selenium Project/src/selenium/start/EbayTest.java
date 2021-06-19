package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTest {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	    System.out.println(driver.getTitle());
		
		driver.findElement(By.id("gh-ac")).sendKeys("JBL SPEAKER");
		driver.findElement(By.id("gh-btn")).click();
		
		driver.navigate().to("https://www.simplilearn.com/");
		driver.navigate().back();
		System.out.println("the page tittle is="+ driver.getTitle());
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
