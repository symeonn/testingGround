package designPatterns.behavioral.observer;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public interface ObserverI {

	boolean isNotified();

	void reset();
	
	void update(String msg);

}
