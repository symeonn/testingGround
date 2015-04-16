package designPatterns.structural.bridge;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class BridgeTest {

	@Test
	public void test() {
		ObjectI objectOne = new ObjectOne(new ImplementorOne());
		ObjectI objectTwo = new ObjectOne(new ImplementorTwo());
		
		assertEquals("implOne", objectOne.doAction());
		assertEquals("implTwo", objectTwo.doAction());
	}

}
