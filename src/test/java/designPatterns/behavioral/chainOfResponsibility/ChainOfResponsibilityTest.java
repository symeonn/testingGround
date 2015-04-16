package designPatterns.behavioral.chainOfResponsibility;

import static org.junit.Assert.*;

import org.junit.Test;

import designPatterns.behavioral.chainOfResponsibility.MultiplicityChain;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ChainOfResponsibilityTest {

	@Test
	public void test() {
		MultiplicityChain chain = new MultiplicityChain();
		
		assertTrue(chain.devide(50));
		assertTrue(chain.devide(20));
		assertTrue(chain.devide(10));
		
		assertTrue(chain.hasReminder(10));
		
		assertFalse(chain.devide(12));
		assertTrue(chain.devide(120));
	}

}
