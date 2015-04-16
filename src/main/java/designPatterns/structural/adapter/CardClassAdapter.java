package designPatterns.structural.adapter;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class CardClassAdapter extends Card implements CardAdapter {

	private static final String prefixBig = "BIGClass";

	@Override
	public String getSignalFromBigPin1() {
		return prefixBig + getSignalFromPin1();
	}

	@Override
	public String getSignalFromBigPin2() {
		return prefixBig + getSignalFromPin1() + getSignalFromPin2();
	}

	@Override
	public String getSignalFromBigPin3() {
		return null;
	}

	@Override
	public String getSignalFromBigPin4() {
		return prefixBig + getSignalFromPin3() + getGroundPin();
	}

	private String getGroundPin() {
		return "Ground";
	}

}
