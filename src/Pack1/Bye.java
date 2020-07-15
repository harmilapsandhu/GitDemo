package Pack1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bye {
	
	@Test(groups={"Arsenal"})
	public void Demo3()
	{
		System.out.println("Output 3");
	}
	
	@AfterSuite
	public void Demo13()
	{
		System.out.println("I'm the last in line");
	}
	
	@BeforeMethod
	public void Demo15()
	{
		System.out.println("I will execute before every method in Bye Class");
	}
	
	@AfterMethod
	public void Demo16()
	{
		System.out.println("I will execute after every method in Bye Class");
	}

	@Test
	public void Flunk()
	{
		System.out.println("Output 3");
		Assert.assertTrue(false);
		
	}
}
