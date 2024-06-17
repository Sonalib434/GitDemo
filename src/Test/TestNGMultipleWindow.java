package Test;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGMultipleWindow{

	WebDriver driver;
	
	@Test
	public void MultipleWindow()
	{		
		try
		{
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			
			//Switching Window/Tab
			driver.switchTo().newWindow(WindowType.TAB);
			
			Set<String> allwindows = driver.getWindowHandles();
			Iterator<String> it = allwindows.iterator();
			String parentid = it.next();
			String childid = it.next();
				
			driver.switchTo().window(childid);
			driver.get("https://rahulshettyacademy.com/");
			
			String FirstCourse = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
			driver.switchTo().window(parentid);
			driver.findElement(By.name("name")).sendKeys(FirstCourse);
			
			//Partial Screenshot of a webelement
			WebElement name = driver.findElement(By.name("name"));
			File ss = name.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(ss, new File("C:\\Users\\sonbhatt\\eclipse-workspace\\TestNGTutorial\\Screenshots\\SS.png"));
			
			
			//get height & width
			System.out.println(name.getRect().getDimension().getHeight());
			System.out.println(name.getRect().getDimension().getWidth());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}
