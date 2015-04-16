package designPatterns.creational.prototype;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public interface IProducts {

	Object clone()  throws CloneNotSupportedException;
	
	String getText();
	Boolean getBool();
	int getNumber();

}
