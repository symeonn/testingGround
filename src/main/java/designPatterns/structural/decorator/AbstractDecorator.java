package designPatterns.structural.decorator;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public abstract class  AbstractDecorator implements ObjectI{

	ObjectI basicObject;
	
	@Override
	public String action() {
		return basicObject.action();
	}
	
}
