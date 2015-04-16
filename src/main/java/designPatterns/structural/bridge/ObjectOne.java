package designPatterns.structural.bridge;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ObjectOne implements ObjectI {

	private ImplementorI implementor;

	public ObjectOne(ImplementorI implementor) {
		this.implementor = implementor;
	}

	/**
	 * @see designPatterns.structural.bridge.ObjectI#doAction()
	 */
	@Override
	public String doAction() {
		// TODO Auto-generated method stub
		return implementor.action();
	}

}
