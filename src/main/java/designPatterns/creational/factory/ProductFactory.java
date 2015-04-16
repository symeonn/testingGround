package designPatterns.creational.factory;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ProductFactory {

	public static IProduct createProduct(String type) {

		if(type.equals("A")){
			return new ProductA();
		}else if(type.equals("B")){
			return new ProductB();
		}
		
		return null;
	}

}
