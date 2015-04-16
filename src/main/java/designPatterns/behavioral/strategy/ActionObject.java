package designPatterns.behavioral.strategy;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ActionObject {

	private String result;

	public void doAction(StrategyI strategy1) {
		result = strategy1.doAction();
	}

	public String result() {
		return result;
	}

}
