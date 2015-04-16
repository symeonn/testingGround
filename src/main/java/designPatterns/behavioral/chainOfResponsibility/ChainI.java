package designPatterns.behavioral.chainOfResponsibility;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public interface ChainI {

	/**
	 * @param i
	 * @return
	 */

	int devide(int i);

	void setNextChain(ChainI nextChain);

}
