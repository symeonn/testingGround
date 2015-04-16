package pl.byMario.playground;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class TestJUnit {

//	@Test
	public void testAdd() {
		String str = "jakiś string";
		assertEquals("jakis string", str);
	}

	@Test
	public void testPrintMsg() {
		String msg = "jakiś string";
		
		MessageUtil msgUtil = new MessageUtil(msg);
		
		assertEquals(msg, msgUtil.printMsg());
	}

	@Test
	public void testDbl() {
		Double d = 2.4d;
		assertEquals(d, d-0.3d, 0.3);
	}
	
}
