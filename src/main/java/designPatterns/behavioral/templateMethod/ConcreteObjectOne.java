package designPatterns.behavioral.templateMethod;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ConcreteObjectOne extends ObjectTemplate {

	@Override
	public String doMonorThing3() {
		return "3Cone";
	}

	@Override
	public String doMonorThing2() {
		return "2Cone";
	}

}
