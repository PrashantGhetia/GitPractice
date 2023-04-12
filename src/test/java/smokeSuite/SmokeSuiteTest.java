package smokeSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeSuiteTest {
	@Test(groups = "Smoke")
	public void smokeSuiteTest() {
		Reporter.log("Smoke Suite Executed",true);
		Reporter.log("poll SCM",true);
	}

}
