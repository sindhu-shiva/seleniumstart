package selenium.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("learn ");
		driver.findElement(By.xpath("//ul[@role='listbox']/child::li/descendant::b[text()=' python']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']/child::li/descendant::div[@class='wM6W7d']"));

		
		System.out.println(+list.size());
		
		for(WebElement e:list)
		{
			System.out.println(e.getText());
			
			if(e.getText().contains(" tools"))
			{
				e.click();
			
				break;
			}
		}
		
		/*List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/desendant:: div[@class='wM6W7d']" ));
		
	
		
	System.out.println("the search results are="+list.size());
	
	for(int i=0;i<list.size();i++)
	{
		
		System.out.println("the list of search results are-->"+list.get(i).getText());
		
		if(list.get(i).getText().contains("learn python")) {
			
			list.get(i).click();
		break;
		}
	}*/
		
		

	}

}
