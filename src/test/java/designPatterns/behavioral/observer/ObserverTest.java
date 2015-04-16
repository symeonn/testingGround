package designPatterns.behavioral.observer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The <code><b>Observer</code></b> pattern: Defines a one-to-many dependency between objects so
 * that when one object changes state, all its dependents are notified and
 * updated automatically.
 * 
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ObserverTest {

	@Test
	public void test() {

		SubjectI topicObj = new SubjectObj();
		ObserverI obs1 = new ObserverObj();
		ObserverI obs2 = new ObserverObj();

		topicObj.registerObserver(obs1);
		assertEquals(1, topicObj.registeredObs());

		topicObj.doAction();
		assertTrue(obs1.isNotified());
		assertFalse(obs2.isNotified());

		topicObj.registerObserver(obs2);
		assertEquals(2, topicObj.registeredObs());

		obs1.reset();
		obs2.reset();
		assertFalse(obs1.isNotified());
		assertFalse(obs2.isNotified());

		topicObj.doAction();
		assertTrue(obs1.isNotified());
		assertTrue(obs2.isNotified());
	}

}
