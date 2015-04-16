package designPatterns.creational.factoryMethod;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public abstract class AbsFactory {

	public IProduct createProduct() {
		return createSpecificProduct();
	}

	public abstract IProduct createSpecificProduct();

}
