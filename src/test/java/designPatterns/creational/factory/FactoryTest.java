package designPatterns.creational.factory;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.mockito.internal.matchers.InstanceOf;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FactoryTest {

	@Test
	public void test() {
		
		IProduct prodA = ProductFactory.createProduct("A");
		assertNotNull(prodA);
		assertThat(prodA, IsInstanceOf.instanceOf(ProductA.class));
		
		IProduct prodB = ProductFactory.createProduct("B");
		assertNotNull(prodB);
		assertThat(prodB, IsInstanceOf.instanceOf(ProductB.class));
	}

}
