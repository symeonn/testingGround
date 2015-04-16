package designPatterns.structural.proxy;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class OriginalObject implements ObjectI {

	private boolean created;

	
	public OriginalObject() {
		createObject();
	}

	@Override
	public boolean created() {
		return created;
	}

	/**
	 * @see designPatterns.structural.proxy.ObjectI#createObject()
	 */
	@Override
	public void createObject() {
		created = true;
	}

}
