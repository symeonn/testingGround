package designPatterns.structural.adapter;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class CardObjectAdapter implements CardAdapter {

	private static final String prefixBig = "BIGObject";
	
	private Card smallCard = new Card();
	
	@Override
	public String getSignalFromBigPin1() {
		return prefixBig + smallCard.getSignalFromPin1();
	}

	@Override
	public String getSignalFromBigPin2() {
		return prefixBig + smallCard.getSignalFromPin1() + smallCard.getSignalFromPin2();
	}

	@Override
	public String getSignalFromBigPin3() {
		return null;
	}

	@Override
	public String getSignalFromBigPin4() {
		return prefixBig + smallCard.getSignalFromPin3() + getGroundPin();
	}

	private String getGroundPin() {
		return "Ground";
	}
	
}
