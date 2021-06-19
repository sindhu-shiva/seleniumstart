package selenium.start;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {
	
	WebDriver driver;

	
	public void window() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		/*	String ParentH= driver.getWindowHandle();
		System.out.println("Parent->"+ParentH);
		driver.findElement(By.id("newWindowBtn")).click();
	
		
		Set<String> ChildH= driver.getWindowHandles();
		for(String handle: ChildH)
		{
			System.out.println(handle);
		}
			
	
	Iterator<String> iter= ChildH.iterator();
	
	String ParentI= iter.next();
	String childI= iter.next();
	driver.switchTo().window(childI);*/
		
	switchToWindow(2);
	System.out.println("THe title of child window is-"+driver.getTitle());
	driver.close();
	Thread.sleep(3000);
	
	//driver.switchTo().window(ParentI);
	switchToWindow(1);
	System.out.println("THe title of parent window is-"+driver.getTitle());
	driver.close();
	}

	
		
	public void switchToWindow(int index)
	{
		String windowId= null;
		Set<String> windowIds= driver.getWindowHandles();
		Iterator<String> iter= windowIds.iterator();
		
		for (int i=1;i<=index;i++)
		{
		windowId= iter.next();
		}
		
		driver.switchTo().window(windowId);
	

	}

	
	public static void main(String[] args) throws InterruptedException {
		
		HandlingWindow obj= new HandlingWindow();
		obj.window();
		// TODO Auto-generated method stub

	}
}
	
	
	
	
