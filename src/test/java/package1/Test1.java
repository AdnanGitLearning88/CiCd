package package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BEFORE TEST");
	}
	
	@Test
	public void test()
	{
		System.out.println("TEST");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AFTER TEST");
	}
	
}
