package selenium.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coding1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://www.worldometers.info/world-population/");
	    
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );
	    
	    int count=1;
	    while(count<=10) {
	    
	    	System.out.println(count + "sec");
	    	System.out.println("==================================================");
		if(count==11) break;
	    {
	    List<WebElement> tot = driver.findElements(By.xpath("//div[@class='maincounter-number' ]/span[@class='rts-counter']"));
	    
	    
	    for (WebElement a:tot)
	    {
	    	System.out.println(a.getText());
	    }
	    
	    System.out.println("--------Today's--------------");
	    List<WebElement> daily = driver.findElements(By.xpath("//div[text()='Today']//parent::div//span[@class='rts-counter']"));
	    for (WebElement b:daily)
	    {
	    	System.out.println(b.getText());
	    }
	    
	    System.out.println("--------This Year--------------");
	    List<WebElement> year = driver.findElements(By.xpath("//div[text()='This year']//parent::div//span[@class='rts-counter']"));
	    for (WebElement c:year)
	    {
	    	System.out.println(c.getText());
	    }
	    
	    Thread.sleep(1000);
	    count++;
	}
	}

}
}




