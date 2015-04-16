package designPatterns.structural.facade;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FacadeObject {

	/**
	 * @param k 
	 * @param j 
	 * @param i 
	 * @return
	 */
	public String makeCombinedActionDependingOnParams(int i, int j, int k) {
		InterfaceOne one = new ConcreteOne();
		InterfaceTwo two = new ConcreteTwo();
		
		return one.action(i) + two.action(j) + one.action(k);
	}


}
