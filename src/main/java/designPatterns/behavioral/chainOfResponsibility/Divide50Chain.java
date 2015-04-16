package designPatterns.behavioral.chainOfResponsibility;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class Divide50Chain implements ChainI {

	
	ChainI nextChain;
	/**
	 * @see designPatterns.behavioral.chainOfResponsibility.ChainI#devide(int)
	 */
	@Override
	public int devide(int i) {
		
		if(i % 50 > 0){
			return nextChain.devide(i % 50);
		}else{
			return i/50;
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
