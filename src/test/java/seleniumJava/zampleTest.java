package seleniumJava;
import org.testng.annotations.Test;

public class zampleTest {

// This .java class file is NOT to be included in any testng.xml file ! This is a MUST. Purpose behind that is:-->
	
  // When testNg.xml file(s) is integrated into maven = integrated into the pom.xml file= integrated into the SureFire pluggin, then
	// Only the valid/accepted mvn commands are going to execute the integrated testNg.xml file(s).
	 //Otherwide, Maven= Pom.xml file will BLINDLY execute EVERYTHING under the 'test' folder.

	//Hence, use this testcase as a measure validating whether the mvn commands are functioning properly or not.
	
	@Test
	public void sampleToValidate()
	{
		System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   WARNING !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(" Warning !: maven (POM.XML file) is BLINDLY executing ALL testcases under the 'Test' folder");
		System.out.println("This is because you've entered an invalid/wrong mvn command");
	}
}
