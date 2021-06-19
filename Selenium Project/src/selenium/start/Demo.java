package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("sindhu.shiva89@gmail.com");
      Thread.sleep(1000);
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        Thread.sleep(2000);
        String at = driver.getTitle();
        String ut= "gmail";
        System.out.println(at);
        driver.close ();
        if(at.equalsIgnoreCase(ut))
        {
        	System.out.println("Test successful");
	}
        else
        {
        	System.out.println("Test failed");
}
       
     //   Assert.assertEquals(at,ut);
}
}
