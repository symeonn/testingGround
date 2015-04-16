package designPatterns.creational.factoryAbstract;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FactoryB implements IFactory {

	/**
	 * @see designPatterns.creational.factoryAbstract.IFactory#createProduct()
	 */
	@Override
	public IProduct createProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
