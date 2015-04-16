package designPatterns.creational.prototype;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ProductsPrototype implements IProducts {

	String text;
	int number;
	Boolean bool;
	
	public ProductsPrototype() {
		
		text = "Test";
		number = 12;
		bool = false;
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String getText() {
		return text;
	}

	public int getNumber() {
		return number;
	}

	public Boolean getBool() {
		return bool;
	}
	
}
