package test;

import org.testng.annotations.Test;

import pages.Createaccountpage;
import pages.Registrationpage;

public class Createaccounttest extends Base {
	
	@Test
	public void test()
	{
		Createaccountpage pg = new Createaccountpage(driver);
		pg.createaccount();
		Registrationpage pg1=new Registrationpage(driver);
		pg1.reg("Anupama", "S", "21-11-1998", "anupamahariprasad@outlook.com", "Anupama@123");
		
	}

}
