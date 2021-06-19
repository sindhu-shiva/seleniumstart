   package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
 driver.findElement(By.xpath("//td [text()='3000']/preceding-sibling::td/input")).click();
 driver.findElement(By.xpath("//a[text()='Click']/parent:: td/parent ::tr/child::td/input")).click();
 driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("a@b.com");
	}

}
