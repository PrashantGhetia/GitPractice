package regressionSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegressionSuiteTest {
	@Test(groups = "Regression")
	public void regressionSuiteTest() {
		Reporter.log("Regression Suite Executed",true);
		Reporter.log("poll SCM",true);
	}

}
