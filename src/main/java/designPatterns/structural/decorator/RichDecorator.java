package designPatterns.structural.decorator;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class RichDecorator extends AbstractDecorator {

	public RichDecorator(ObjectI basicObject) {
		this.basicObject = basicObject;
	}

	@Override
	public String action() {
		return "Rich" + basicObject.action();
	}

}
