package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrationpage {
	WebDriver driver;
	By fname = By.xpath("//input[@id='RegisterForm-FirstName']");
	By lname = By.xpath("//input[@placeholder='Last name']");
	By dob = By.xpath("//input[@placeholder='Date of Birth']");
	By email = By.xpath("//input[@name='contact[email]']");
	By password = By.xpath("//input[@name='customer[password]']");
	By checkbox = By.xpath("//input[@id='tc-check']");
	By createbtn = By.xpath("//button[@class='sub-btn']");
	
	public Registrationpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void reg(String firstname,String lastname,String dateofbirth,String mail,String pswd)
	{
		driver.findElement(fname).sendKeys(firstname);
		driver.findElement(lname).sendKeys(lastname);
		driver.findElement(dob).sendKeys(dateofbirth);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pswd);
		
		driver.findElement(checkbox).click();
		driver.findElement(createbtn).click();
		
	}
	

}
