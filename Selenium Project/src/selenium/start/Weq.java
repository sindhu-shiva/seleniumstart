package selenium.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Weq {
	
	WebDriver driver;
	
	public void Weqstart(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver() ;
	driver.get("https://ent-mls-qweb1.itocservices.com/Webportal/Login.aspx?ReturnUrl=%2fWebPortal");
	driver.findElement(By.xpath("//input[@name='ctl00$PagePlaceHolder$LoginControl$UserName']")).sendKeys("52101780");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.findElement(By.id("ctl00_PagePlaceHolder_LoginControl_Password")).sendKeys("Conduent@123");	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println("The main home page is there");
	
	Actions a=new Actions(driver);
	WebElement weq1 = driver.findElement(By.linkText("WeQ"));
	a.moveToElement(weq1).perform();
	
	WebDriverWait w= new WebDriverWait(driver, 20);
	w.until(ExpectedConditions.visibilityOf(weq1));
	
	
	WebElement entry = driver.findElement(By.linkText("• Entry"));
	a.moveToElement(entry).perform();
	driver.findElement(By.linkText("• Entry")).click();
	List <WebElement> list= driver.findElements(By.tagName("a"));
	int s= list.size();
	System.out.println("The total links are="+s);
	
	for (int i=0;i<s;i++)
	{
//		System.out.println( list.get(i).getText());
	}
	
	}
	public static void main(String[] args) {
		
		Weq obj= new Weq();
		obj.Weqstart();
		// TODO Auto-generated method stub

	}

}
