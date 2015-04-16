package designPatterns.structural.facade;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * from http://stackoverflow.com/questions/3489131/what-is-the-difference-between-the-facade-proxy-adapter-and-decorator-design
 * <br/>
 * <br/>
 * <code><b>Facade</b></code> is more like a simple gateway to a complicated set of functionality.
 * You make a black-box for your clients to worry less i.e. make interfaces
 * simpler.
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FacadeTest {

	@Test
	public void test() {
		InterfaceOne objectOne = new ConcreteOne();
		InterfaceTwo objectTwo = new ConcreteTwo();

		FacadeObject facade = new FacadeObject();

		assertEquals("actionOne1", objectOne.action(1));
		assertEquals("actionOne2", objectOne.action(2));
		assertEquals("actionOne3", objectOne.action(3));

		assertEquals("actionTwo1", objectTwo.action(1));
		assertEquals("actionTwo2", objectTwo.action(2));
		assertEquals("actionTwo3", objectTwo.action(3));

		assertEquals("actionOne1actionTwo3actionOne2", facade.makeCombinedActionDependingOnParams(1, 3, 2));


	}

}
