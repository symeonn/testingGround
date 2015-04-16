package pl.byMario.playground;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class TestRunner {

	/**
	 * @param args
	 * @author Mariusz Lewandowski; byMario.pl
	 */
	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(TestJUnit.class);
		
		for(Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
