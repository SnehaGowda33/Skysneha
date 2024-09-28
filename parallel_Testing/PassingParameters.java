package parallel_Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameters {
@Parameters({"fname","lname"})
	@Test
	void testmethodString (String abc,String xyz)
	{
		System.out.println("Java");
		System.out.println("Selenium");
	}
}
