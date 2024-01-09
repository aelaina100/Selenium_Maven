package seleniumJava;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Intended_to_FailTest {
	
	@Test
	public void intendedtoFailone()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++ ");
		System.out.println("FAILING on Purpose, Reason: To view reports under 'target/surefire-reports' folder ");
		System.out.println("");
		System.out.println("These reports are: index.html  & testng-results.xml");
		System.out.println("For the 'testng-results.xml' file, I need to integrate it with Jenkins, this is ");
		System.out.println("for generating testNg reports in Jenkins ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++ ");
		System.out.println("");
		Assert.assertFalse(true);
	}
	

}
