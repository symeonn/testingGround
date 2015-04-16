package designPatterns.behavioral.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class StrategyTest {

	@Test
	public void test() {
		ActionObject obj = new ActionObject();
		
		StrategyI strategy1 = new StrategyOne();
		StrategyI strategy2 = new StrategyTwo();
		
		obj.doAction(strategy1);
		assertEquals("strategyOne result", obj.result());

		obj.doAction(strategy2);
		assertEquals("strategyTwo result", obj.result());
	}

}
