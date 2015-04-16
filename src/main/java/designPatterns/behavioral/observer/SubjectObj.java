package designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class SubjectObj implements SubjectI {

	List<ObserverI> registeredObserwers = new ArrayList<>();
	
	@Override
	public void registerObserver(ObserverI obs1) {
		registeredObserwers.add(obs1);
	}

	@Override
	public void doAction() {
		
		for(ObserverI observer : registeredObserwers) {
			observer.update("action done");
		}
		
	}

	/**
	 * @see designPatterns.behavioral.observer.SubjectI#registeredObs()
	 */
	@Override
	public int registeredObs() {
		return registeredObserwers.size();
	}

}
