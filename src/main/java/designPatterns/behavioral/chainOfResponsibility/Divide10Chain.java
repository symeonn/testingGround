package designPatterns.behavioral.chainOfResponsibility;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class Divide10Chain implements ChainI {

	ChainI nextChain;
	
	@Override
	public int devide(int i) {
		if(i % 10 > 0) {
			return nextChain.devide(i % 10);
		}
		else {
			return i / 10;
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
