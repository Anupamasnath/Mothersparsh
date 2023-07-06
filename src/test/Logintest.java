package test;

import org.testng.annotations.Test;

import pages.Loginpage;

public class Logintest extends Base {
	
	@Test
	public void test()
	{
		Loginpage pg2 = new Loginpage(driver);
		pg2.logindetails("anupamahariprasad@outlook.com", "Anupama@123");
		
	}
	
	

}
