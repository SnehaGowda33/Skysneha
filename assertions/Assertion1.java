package assertions;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	/*
	 *  Assert - Hard Assert- Class - If assert fail- fail the script
	 *  SoftAssert- Class - If assert fails then it will cont till the last but will fail at end
	 *  Selenium IDE
	 * 		Assert
	 * 		Verify- Soft Assert
	 */
	
	@Test(priority=1)
	public void test1()
	{
		String exp="Mukesh Otwani";
		String actual="Mukesh Otwani ";
		Assert.assertEquals(actual, exp,"Name does not match");
		
		
	}
	
	@Test(priority=2)
	public void test2()
	{
		String actual="Selenium is for web automation";
		
		// partial match - Way 1
		Assert.assertEquals(actual.contains("web"), true,"Msg does not contain web");
	
		
	}
	
	@Test(priority=3)
	public void test3()
	{
		String actual="Selenium is for web automation";
		
		// partial match - Way 2
		Assert.assertTrue(actual.contains("web"),"Selenium not present");
		
	}
	
	@Test(priority=4)
	public void test4()
	{
		int actual=10;
		int expected=10;
		Assert.assertEquals(10, 10);
		Assert.assertTrue(actual==expected);
		
	}
	
	@Test(priority=5)
	public void test5()
	{
		System.out.println("Start");
		
		List<String> actual= Arrays.asList("Selenium","WebDriver","IDE","Grid");
		
		List<String> expected= Arrays.asList("Selenium","WebDriver","IDE","Grid");
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("End");
	}
	
	
}
