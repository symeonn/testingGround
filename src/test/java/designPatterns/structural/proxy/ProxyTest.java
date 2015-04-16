package designPatterns.structural.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * from http://stackoverflow.com/questions/3489131/what-is-the-difference-between-the-facade-proxy-adapter-and-decorator-design
 * <br/>
 * <br/>
 * <code><b>Proxy</b></code> provides the same interface as the proxied-for class and typically does
 * some housekeeping stuff on its own. (So instead of making multiple copies of
 * a heavy object X you make copies of a lightweight proxy P which in turn
 * manages X and translates your calls as required.) You are solving the problem
 * of the client from having to manage a heavy and/or complex object.
 * 
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ProxyTest {

	@Test
	public void testOriginalObject() {

		ObjectI hevyLoadObject1 = new OriginalObject();
		ObjectI hevyLoadObject2 = new OriginalObject();
		ObjectI hevyLoadObject3 = new OriginalObject();

		assertTrue(hevyLoadObject1.created());
		assertTrue(hevyLoadObject2.created());
		assertTrue(hevyLoadObject3.created());

		hevyLoadObject1.createObject();
		hevyLoadObject2.createObject();
		hevyLoadObject3.createObject();

		assertTrue(hevyLoadObject1.created());
		assertTrue(hevyLoadObject2.created());
		assertTrue(hevyLoadObject3.created());
	}

	@Test
	public void testProxyObject() {

		ObjectI proxyObject1 = new ProxyObject();
		ObjectI proxyObject2 = new ProxyObject();
		ObjectI proxyObject3 = new ProxyObject();

		assertFalse(proxyObject1.created());
		assertFalse(proxyObject2.created());
		assertFalse(proxyObject3.created());

		proxyObject1.createObject();
		proxyObject2.createObject();
		proxyObject3.createObject();

		assertTrue(proxyObject1.created());
		assertTrue(proxyObject2.created());
		assertTrue(proxyObject3.created());
	}

}
