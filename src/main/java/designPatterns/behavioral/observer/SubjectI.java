package designPatterns.behavioral.observer;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public interface SubjectI {

	/**
	 * @param obs1
	 */
	void registerObserver(ObserverI obs1);

	/**
	 * 
	 */
	void doAction();

	/**
	 * @return
	 */
	int registeredObs();

}
