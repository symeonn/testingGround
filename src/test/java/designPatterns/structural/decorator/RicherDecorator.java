package designPatterns.structural.decorator;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class RicherDecorator extends AbstractDecorator {

	public RicherDecorator(ObjectI basicObject) {
		this.basicObject = basicObject;
	}
	
	@Override
	public String action() {
		return "Richer"+basicObject.action();
	}

}
