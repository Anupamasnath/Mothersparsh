package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Base {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.get("https://mothersparsh.com/");
		driver.manage().window().maximize();
		
	}

}
