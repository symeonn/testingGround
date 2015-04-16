package designPatterns.creational.factoryAbstract;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FactoryAbstractTest {

	@Test
	public void test() {

		IFactory factoryA = FactoryMaker.createFactory("A");
		assertNotNull(factoryA);
		assertThat(factoryA, IsInstanceOf.instanceOf(FactoryA.class));

		IProduct productA = factoryA.createProduct();
		assertNotNull(productA);
		assertThat(productA, IsInstanceOf.instanceOf(ProductA.class));
		
		IFactory factoryB = FactoryMaker.createFactory("B");
		assertNotNull(factoryB);
		assertThat(factoryB, IsInstanceOf.instanceOf(FactoryB.class));
		
		IProduct productB = factoryB.createProduct();
		assertNotNull(productB);
		assertThat(productB, IsInstanceOf.instanceOf(ProductB.class));
		
	}

}
