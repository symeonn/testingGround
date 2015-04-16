package designPatterns.behavioral.chainOfResponsibility;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class Divide20Chain implements ChainI {

	ChainI nextChain;

	@Override
	public int devide(int i) {
		if(i % 20 > 0) {
			return nextChain.devide(i % 20);
		}
		else {
			return i / 20;
		}
	}

	/**
	 * @see designPatterns.behavioral.chainOfResponsibility.ChainI#setNextChain(designPatterns.behavioral.chainOfResponsibility.ChainI)
	 */
	@Override
	public void setNextChain(ChainI nextChain) {
		this.nextChain = nextChain;
	}

}
