package Pack1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hello {
	
	@Test(groups={"Arsenal"})
	public void Demo1()
	{
		System.out.println("Output 1");
	}
	
	//A second test case can be defined just by giving another @Test Annotation

	@Parameters({"Premier"})
	@Test
	public void Demo2(String English)
	{
		System.out.println("Output 2");
		System.out.println(English);
	}
}

//The order of execution in TestNG is based on alphabetical order.
//This is a class Hello with 2 methods defined Demo 1 and Demo2
//In XML file,
//we can use include and exclude methods to select or deselect test cases that we want to run
//Also with include and exclude, we can use regular expressions to simplify what we want to run with syntax: <keyword>.*

//We can limit our test runs to package level as well

//@BeforeTest Annotation can be added to any method to prioritize that test. This can be put at any method within a test case and will execute
//before anything else. This is usually used to clear data from previous runs.

//@AfterTest will execute any particular method within the test name defined in XML at the very end. This usually defined to delete cookies etc.

//@BeforeSuite & @AfterSuite can be used to run any test case at the very beginning or very last, no matter where it is defined.

//@BeforeMethod is specific to class file and independent to XML file. It executes before each and every method defined in that class file, so
//if there are 4 methods, it will execute 4 times before each method. @AfterMethod is similarly used

//@BeforeClass is executed before any method within a single class. @AfterClass is similarly executed at last.

//@BeforeMethod and @BeforeClass are independent of XML file.

//Groups
//Use syntax @Test(groups={"AnyName"}) with any method to mark it to a group which can be executed together. Any methods in different classes
//can be tagged with groups keyword and executed together. This is only syntax where tests in different classes can be executed together.
//In XML, use Groups-> run-> include (or exclude)-> 'keyword'

//Add dependencies using syntax @Test(dependsOnMethods={"keyword"}). This is not used with XML and are executed within a class. Whichever method
//is enclosed within the keyword will execute before the @Test on which dependency is applied.

//Two TestNG helper attributes: enabled=false & timeout
//(enabled=false) will skip a given test in execution. It can be used to mark something that you know contains a bug to be fixed later so that
//the bug doesn't show in the execution.
//Syntax for timeout: @Test(timeOut=4000) This will wait for 40 seconds before throwing a failure error.

//Parameters - These are defined in XML file and can be used in any class to call that value.
//Syntax for calling - @Parameters({"<parameter name defined in XML file>"}), then store it in a string at public void Demo(String EPL). For
//multiple values use commas in the class window, also define multiple strings with commas
//Parameters can be applied at Suite level or Test level

//@DataProvider Annotation - This is specific to class files and not XML. This is used to define data which can be triggered by any Test case.
//First we define data with @DataProvider Annotation and defining objects (refer to Hollla class). Then we return that data to any Test case
//with annotation @Test(DataProvider="<name>")

//ITestListener will implement all the methods of Listeners interface. This has to be defined in XML file(Suite level). For any of the methods defined,
//Listener will execute that depending on the test results. e.g. we can print a screenshot every time a test fails by writing a screenshot code
//in 'onTestFailure' method. Also, we can use result.getName() to print the name of test that failed.

//Parallel attribute is used to run several tests simultaneously. It is applied at XML file.