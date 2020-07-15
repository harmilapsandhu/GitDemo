	package Pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hollla {
	
	@Parameters({"URL", "Return"})
	@Test
	public void Demo4(String EPL, String Match)
	{
		System.out.println("Output 4");
		System.out.println(EPL);
		System.out.println(Match);
	}
	

	@Test(groups={"Arsenal"})
	public void Demo5()
	{
		System.out.println("Output 5");
	}
	
	@BeforeSuite
	public void Demo14()
	{
		System.out.println("I'm the first in line");
	}
	
	@Test(dataProvider="MatchDay")
	public void Demo6(String Match, String Opponents)
	{
		System.out.println("Output 6");
		System.out.println(Match);
		System.out.println(Opponents);
	}
	
	@DataProvider
	public Object[][] MatchDay()
	{
		Object[][] June17 = new Object[3][2];  //This will give 3 rows and 2 columns
		June17[0][0] = "Match 1";
		June17[0][1] = "Aston Villa V Sheffield United";
		June17[1][0] = "Match 2";
		June17[1][1] = "Manchester City V Arsenal";
		June17[2][0] = "Match 3";
		June17[2][1] = "Leverkusen V Koln";
		return June17;
		// We will return this data in test Demo6
				
		
	}
	
}
