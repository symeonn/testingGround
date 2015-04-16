package designPatterns.creational.factoryAbstract;


/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FactoryA implements IFactory {

	/**
	 * @see designPatterns.creational.factoryAbstract.IFactory#createProduct()
	 */
	@Override
	public IProduct createProduct() {
		return new ProductA();
	}

}
