package designPatterns.behavioral.templateMethod;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ConcreteObjectTwo extends ObjectTemplate {

	@Override
	public String doMonorThing3() {
		return "3Ctwo";
	}

	@Override
	public String doMonorThing2() {
		return "2Ctwo";
	}

}
