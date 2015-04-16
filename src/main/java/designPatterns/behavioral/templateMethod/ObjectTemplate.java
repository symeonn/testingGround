package designPatterns.behavioral.templateMethod;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public abstract class ObjectTemplate {

	/**
	 * @return
	 */
	public String doMajorThing() {

		String result = "";
		result += doMonorThing1();
		result += doMonorThing2();
		result += doMonorThing3();
		result += doMonorThing4();
		return result;
	}

	private String doMonorThing4() {
		return "4T";
	}

	public abstract String doMonorThing3();

	public abstract String doMonorThing2();

	private String doMonorThing1() {
		return "1T";
	}

}
