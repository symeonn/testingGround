package designPatterns.creational.singleton;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class Singleton {

	static Singleton instance = null;
	
	
	
	/**
	 * 
	 */
	private Singleton() {
	}



	public static Singleton getInstance() {
		
		if(instance==null){
			instance = new Singleton();
		}
		
		return instance;
	}

}
