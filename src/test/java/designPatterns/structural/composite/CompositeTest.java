package designPatterns.structural.composite;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;


/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class CompositeTest {

	BaseCompositeObject composite;
	
	@Test
	public void testComposite() {
		
		buildComposite();
		
		assertEquals(6, composite.size());
		assertEquals("ACTION", composite.getElement(1).doAction());
		assertEquals("6", composite.doAction());
		
		
	}
	
	@Test
	public void testComplexComposite() {
		
		buildComposite();
		addBaseElement();
		
		assertEquals(7, composite.size());
		assertEquals("ACTION", composite.getElement(1).doAction());
		assertEquals("7", composite.doAction());
		
		assertEquals("0", composite.getElement(6).doAction());
		assertThat(composite.getElement(6), IsInstanceOf.instanceOf(BaseCompositeObject.class));
		assertEquals(0, ((BaseCompositeObject)composite.getElement(6)).size());
		
	}

	/**
	 * 
	 */
	private void addBaseElement() {
		
		BaseCompositeObject baseElement = new BaseCompositeObject();	
		composite.add(baseElement);
	}

	/**
	 * 
	 */
	private void buildComposite() {
		composite = new BaseCompositeObject();	
		
		CompositeObject subObject1 = new LeafCompositeObject();
		CompositeObject subObject2 = new LeafCompositeObject();
		CompositeObject subObject3 = new LeafCompositeObject();
		CompositeObject subObject4 = new LeafCompositeObject();
		CompositeObject subObject5 = new LeafCompositeObject();
		CompositeObject subObject6 = new LeafCompositeObject();
		
		composite.add(subObject1);
		composite.add(subObject2);
		composite.add(subObject3);
		composite.add(subObject4);
		composite.add(subObject5);
		composite.add(subObject6);
		
	}

}
