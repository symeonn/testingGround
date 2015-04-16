package designPatterns.behavioral.chainOfResponsibility;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class MultiplicityChain {

	ChainI c50;
	
	public MultiplicityChain(){
		c50 = new Divide50Chain();
		ChainI c20 = new Divide20Chain();
		ChainI c10 = new Divide10Chain();
		
		c50.setNextChain(c20);
		c20.setNextChain(c10);
	}
	
	public boolean devide(int i) {
		
		try{
			c50.devide(i);
			return true;
		}catch (Exception e) {
			return false;
		}
	}


	/**
	 * @param i
	 * @return
	 */
	public int howMany50(int i) {
		
		return c50.devide(i);
	}

	/**
	 * @param i
	 * @return
	 */
	public boolean hasReminder(int i) {
		try{
			c50.devide(i);
			return true;
		}catch (Exception e) {
			return false;
		}
	}



}
