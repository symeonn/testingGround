package designPatterns.structural.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

import designPatterns.structural.proxy.ProxyObject;

/**
 * from http://stackoverflow.com/questions/3489131/what-is-the-difference-between-the-facade-proxy-adapter-and-decorator-design
 * <br/>
 * <br/>
 * <code><b>Adapter</b></code> adapts a given class/object to a new interface. In the case of the
 * former, multiple inheritance is typically employed. In the latter case, the
 * object is wrapped by a conforming adapter object and passed around. The
 * problem we are solving here is that of non-compatible interfaces.
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class AdapterTest {

	@Test
	public void testSmallCard() {
		Card smallCard = new Card();

		assertEquals("Pin1", smallCard.getSignalFromPin1());
		assertEquals("Pin2", smallCard.getSignalFromPin2());
		assertEquals("Pin3", smallCard.getSignalFromPin3());
	}

	@Test
	public void testObjectAdapter() {
		CardAdapter objectAdapterCard = new CardObjectAdapter();

		assertEquals("BIGObjectPin1", objectAdapterCard.getSignalFromBigPin1());
		assertEquals("BIGObjectPin1Pin2", objectAdapterCard.getSignalFromBigPin2());
		assertNull(objectAdapterCard.getSignalFromBigPin3());
		assertEquals("BIGObjectPin3Ground", objectAdapterCard.getSignalFromBigPin4());
	}

	@Test
	public void testClassAdapter() {
		CardAdapter classAdapterCard = new CardClassAdapter();

		assertEquals("BIGClassPin1", classAdapterCard.getSignalFromBigPin1());
		assertEquals("BIGClassPin1Pin2", classAdapterCard.getSignalFromBigPin2());
		assertNull(classAdapterCard.getSignalFromBigPin3());
		assertEquals("BIGClassPin3Ground", classAdapterCard.getSignalFromBigPin4());
	}

}
