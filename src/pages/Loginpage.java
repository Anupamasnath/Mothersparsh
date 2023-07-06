package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	By loginbtn = By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[2]");
	By email = By.id("CustomerEmail");
	By password = By.id("CustomerPassword");
	By btnclick = By.xpath("//*[@id=\"customer_login\"]/button");
	
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public void logindetails(String emailid,String pswd)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("webklipper-publisher-widget-container-survey-frame");
		driver.findElement(By.id("survey-close-div")).click();
		driver.switchTo().defaultContent();
		driver.findElement(loginbtn).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)","");
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(btnclick).click();
	}

}
