package designPatterns.structural.proxy;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ProxyObject implements ObjectI {

	private boolean created;

	@Override
	public boolean created() {
		return created;
	}

	@Override
	public void createObject() {
		created = true;		
	}

}
