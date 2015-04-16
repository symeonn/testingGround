package designPatterns.structural.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * from http://stackoverflow.com/questions/3489131/what-is-the-difference-between-the-facade-proxy-adapter-and-decorator-design
 * <br/>
 * <br/>
 * <code><b>Decorator</b></code> is used to add more gunpowder to your objects (note the term
 * objects -- you typically decorate objects dynamically at runtime). You do not
 * hide/impair the existing interfaces of the object but simply extend it at
 * runtime.
 * 
 * Now that you have decorator involved, you will probably want to know why the
 * emphasis on the word object -- some languages (like Java) simply don't allow
 * virtual inheritance (i.e. multiple inheritance as C++ does) to allow you to
 * accomplish this at compile time.
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class DecoratorTest {

	@Test
	public void testBasicObject() {
	
		ObjectI basicObject = new BasicObject();
		
		assertEquals("BasicObjectAction", basicObject.action());
	}
	
	@Test
	public void testDecoratorObject() {
		
		AbstractDecorator richObject = new RichDecorator(new BasicObject());
		AbstractDecorator richerObject = new RicherDecorator(new RichDecorator(new BasicObject()));
		
		assertEquals("RichBasicObjectAction", richObject.action());
		assertEquals("RicherRichBasicObjectAction", richerObject.action());
	}

}
