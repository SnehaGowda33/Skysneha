package testNG;

import org.testng.annotations.Test;

public class MyFirstTestNG2 {
	
	@Test(priority = 1)
	  public void loginApplication() 
	  {
		  System.out.println("User is able to login");
	  }
	  
	  @Test(priority = 2)
	  public void createCouse()
	  {
		  System.out.println("User is able to add courses");
	  }
	  
	  @Test(priority = 3,enabled = false)
	  public void deleteCourse()
	  {
		  System.out.println("User is able to delete courses");
	  }
	  
	  @Test(priority = 4)
	  public void logoutFromApplication()
	  {
		  System.out.println("User is able to logout");
	  }
}
