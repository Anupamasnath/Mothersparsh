package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Createaccountpage {

	WebDriver driver;
	By loginbtn=By.xpath("//a[@class='header__icon header__icon--account link focus-inset small-hide']");
	By createaccount=By.xpath("//a[@href='/account/register']");
	
	public Createaccountpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void createaccount()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("webklipper-publisher-widget-container-survey-frame");
		driver.findElement(By.id("survey-close-div")).click();
		driver.switchTo().defaultContent();
		driver.findElement(loginbtn).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		driver.findElement(createaccount).click();
	}
	
}
