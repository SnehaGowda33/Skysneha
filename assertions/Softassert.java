package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void test1()
	{
		System.out.println("Start");
		String exp="Mukesh Otwani";
		String actual="Mukesh Otwani ";
		
	   SoftAssert s1=new SoftAssert();
		s1.assertEquals(actual, exp, "name doesnot match");
		//s1.assertTrue(true);
		s1.assertFalse(true);
		//s1.assertNotEquals(false, false);
		s1.assertNull(null);
		//s1.assertNotNull(s1);
		
		
		System.out.println("End");
		
		s1.assertAll();
	
	}
	
	@Test
	public void test2()
	{
		SoftAssert softAssert=new SoftAssert();
		
		String tool="Selenium";
		
		if(tool.equalsIgnoreCase("Katalon"))
		{
			Assert.fail();
		}
		
		
		softAssert.assertAll();
	
	}
	

}
