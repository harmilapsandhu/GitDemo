package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iuejeva {
	
	@Test(dependsOnMethods={"MobileDemo9","MobileDemo10"})
	public void Demo7()
	{
		System.out.println("Output 7");
	}
	
	//Add dependencies using syntax (dependsOnMethods={"keyword"}), Here Demo7 depends on MobileDemo9 so it will execute MobileDemo9 first.
	
	@BeforeClass
	public void Demo17()
	{
		System.out.println("This executes before all methods within Iuejeva");
	}
	
	@AfterClass
	public void Demo18()
	{
		System.out.println("This executes after all methods within Iuejeva");
	}

	@AfterTest
	public void Demo12()
	{
		System.out.println("This will execute last");
	}
	//@AfterTest will execute this particular method within the test name defined in XML at the very end.
	
	@Test(groups={"Arsenal"})
	public void Demo8()
	{
		System.out.println("Output 8");
	}
	
	@Test
	public void MobileDemo9()
	{
		System.out.println("Emi made a save of the season");
	}
	
	@Test
	public void MobileDemo10()
	{
		System.out.println("Output Mobile 10");
	}
	
	@Test
	public void MobileDemo101()
	{
		System.out.println("Holding had Mane in his back pocket");
	}
	
	@Test
	public void MobileDemo102()
	{
		System.out.println("Laca with a goal and assist");
	}
	
	@BeforeTest
	public void Demo11()
	{
		System.out.println("This will run first");
	}
	//Use @BeforeTest to prioritize and run this test ahead of any other tests within the test name defined in XML
	
	@Test(enabled=false)
	public void Demo19()
	{
		System.out.println("Output 19");
	}
	//(enabled=false) will skip this test in execution. It can be used to mark something that you know contains bug to be fixed later so that
	//the bug doesn't show in the execution.
	
	@Test(timeOut=4000)  //This will wait for 40 seconds before throwing an error
	public void Demo20()
	{
		System.out.println("Output 20");
	}
	
}

