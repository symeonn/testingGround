package designPatterns.behavioral.observer;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ObserverObj implements ObserverI {

	private boolean notified;
	
	@Override
	public boolean isNotified() {
		return notified;
	}

	@Override
	public void reset() {
		notified = false;
	}

	@Override
	public void update(String msg) {
		
		if(!msg.isEmpty()){
			notified = true;
		}
	}

}
