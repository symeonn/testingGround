package designPatterns.creational.factoryMethod;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FactoryMethodTest {

	@Test
	public void test() {
		
		AbsFactory fmA = new FactoryA();
		assertNotNull(fmA);
		
		IProduct prodA = fmA.createProduct();
		assertThat(prodA, IsInstanceOf.instanceOf(ProductA.class));
		
		AbsFactory fmB = new FactoryB();
		assertNotNull(fmA);
		
		IProduct prodB = fmB.createProduct();
		assertThat(prodB, IsInstanceOf.instanceOf(ProductB.class));
		
	}

}
