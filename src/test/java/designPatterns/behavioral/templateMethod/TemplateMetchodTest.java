package designPatterns.behavioral.templateMethod;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class TemplateMetchodTest {

	@Test
	public void test() {
		ObjectTemplate objectOne = new ConcreteObjectOne();
		ObjectTemplate objectTwo = new ConcreteObjectTwo();
		
		assertEquals("1T2Cone3Cone4T", objectOne.doMajorThing());
		assertEquals("1T2Ctwo3Ctwo4T", objectTwo.doMajorThing());
	}

}
