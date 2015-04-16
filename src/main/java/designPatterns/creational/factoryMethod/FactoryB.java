package designPatterns.creational.factoryMethod;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FactoryB extends AbsFactory {

	/**
	 * @see designPatterns.creational.factoryMethod.AbsFactory#createSpecificProduct()
	 */
	@Override
	public IProduct createSpecificProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
