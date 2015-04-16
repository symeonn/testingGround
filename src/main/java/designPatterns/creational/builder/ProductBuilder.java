package designPatterns.creational.builder;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ProductBuilder {

	String name;
	int warrantyYears;
	boolean packed;

	public ProductBuilder() {
	}

	public ProductBuilder(String name) {
		this.name = name;
	}

	public ProductBuilder(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}

	public ProductBuilder setPacked(boolean packed) {
		this.packed = packed;
		// TODO Auto-generated method stub
		return this;
	}

	public Product build() {

		Product product = new Product();
		product.setName(name);
		product.setWarrantyYears(warrantyYears);
		product.setPacked(packed);
		return product;
	}

	public String getName() {
		return name;
	}

	public ProductBuilder appendName(String name) {
		this.name = name;
		
		return this;
	}

	/**
	 * @return
	 */
	public ProductBuilder appendWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
		return this;
	}

}
