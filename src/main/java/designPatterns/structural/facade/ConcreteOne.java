package designPatterns.structural.facade;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ConcreteOne implements InterfaceOne {

	@Override
	public String action(int i) {
		// TODO Auto-generated method stub
		return "actionOne"+i;
	}

}
