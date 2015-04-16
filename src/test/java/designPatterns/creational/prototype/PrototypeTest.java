package designPatterns.creational.prototype;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class PrototypeTest {

	@Test
	public void test() {
		
		try {
		IProducts productsPrototype = new ProductsPrototype();
		assertNotNull(productsPrototype);
		assertEquals("Test", productsPrototype.getText());
		assertFalse(productsPrototype.getBool());
		assertEquals(12, productsPrototype.getNumber());
		
		IProducts products = (IProducts)productsPrototype.clone();
		assertNotNull(products);
		assertThat(products, IsInstanceOf.instanceOf(ProductsPrototype.class));
		assertEquals("Test", products.getText());
		assertFalse(products.getBool());
		assertEquals(12, products.getNumber());
		
		}
		catch(CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
