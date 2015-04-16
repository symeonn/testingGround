package designPatterns.creational.factoryAbstract;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class FactoryMaker {

	public static IFactory createFactory(String factorySign) {
		
		if(factorySign.compareToIgnoreCase("A")==0){
			return new FactoryA();
		}else{
			return new FactoryB();
		}
	}

}
