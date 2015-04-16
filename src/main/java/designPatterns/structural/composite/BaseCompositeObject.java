package designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class BaseCompositeObject implements CompositeObject {

	List<CompositeObject> subElements = new ArrayList<>();
	
	public void add(CompositeObject leaf){
		subElements.add(leaf);
	}

	/**
	 * @return
	 */
	public int size() {
		return subElements.size();
	}

	/**
	 * @param i
	 * @return
	 */
	public CompositeObject getElement(int i) {
		return subElements.get(i);
	}

	/**
	 * @see designPatterns.structural.composite.CompositeObject#doAction()
	 */
	@Override
	public String doAction() {

		int i = 0;
		
		for(CompositeObject subElement : subElements) {
			if(subElement.doAction()!=null) ++i;
		}

		return String.valueOf(i);
	}
}
