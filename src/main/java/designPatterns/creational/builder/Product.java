package designPatterns.creational.builder;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class Product {

	String name;
	int warrantyYears;
	boolean packed;
	static int nextId;
	int id;

	public Product() {
		id = ++nextId;
	}


	public void setName(String name) {
		this.name = name;
		
	}

	public String getName() {
		return this.name;
	}

	public int getWarrantyYears() {
		// TODO Auto-generated method stub
		return warrantyYears;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}


	public boolean isPacked() {
		return packed;
	}


	public void setPacked(boolean packed) {
		this.packed = packed;
	}

}
