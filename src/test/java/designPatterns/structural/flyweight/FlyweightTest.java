package designPatterns.structural.flyweight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FlyweightTest {

	@Test
	public void test() {
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_1);
		assertEquals(1, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_1);
		assertEquals(1, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_1);
		assertEquals(1, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_2);
		assertEquals(2, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_2);
		assertEquals(2, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_1);
		assertEquals(2, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_3);
		assertEquals(3, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_2);
		assertEquals(3, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_3);
		assertEquals(3, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_1);
		assertEquals(3, ObjectFactory.checkCreatedObjectCount());
		
		ObjectFactory.getObject(ObjectFactory.Type.TYPE_3);
		assertEquals(3, ObjectFactory.checkCreatedObjectCount());
		
	}

}
