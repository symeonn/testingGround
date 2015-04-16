package designPatterns.creational.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
@RunWith(MockitoJUnitRunner.class)
public class BuilderTest {

	
	
	@Test
	public void test() {
		Product prodA = new ProductBuilder().setPacked(false).build();
		assertNotNull(prodA);
		assertNull(prodA.getName());
		assertFalse(prodA.isPacked());
		assertEquals(0, prodA.getWarrantyYears());
		
		Product prodB = new ProductBuilder().appendName("name1").setPacked(true).build();
		assertNotNull(prodB);
		assertEquals("name1", prodB.getName());
		assertTrue(prodB.isPacked());
		assertEquals(0, prodB.getWarrantyYears());
		
		Product prodC = new ProductBuilder().appendName("name2").appendWarrantyYears(2).build();
		assertNotNull(prodC);
		assertEquals(2, prodC.getWarrantyYears());
		assertFalse(prodC.isPacked());
		
		assertEquals(1, prodA.getId());
		assertEquals(2, prodB.getId());
		assertEquals(3, prodC.getId());
	}
	
}
