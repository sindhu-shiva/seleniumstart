package selenium.start;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;



public class screenshot {
	
	WebDriver driver;
	
	public void screen() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		TakesScreenshot ts= (TakesScreenshot) driver;
	 File source= ts.getScreenshotAs(OutputType.FILE);
	 File dest= new File("C:\\Users\\52101780\\Desktop\\s.png");
	 Files.copy(source, dest);

		
		
		
	}
	

	public static void main(String[] args) throws IOException {
		
		screenshot obj= new screenshot();
		obj.screen();
		
		
		
		// TODO Auto-generated method stub

	}

}
