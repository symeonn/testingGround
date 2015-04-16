package designPatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ObjectFactory {

	static private Map<Type, ObjectI> objectsCreated = new HashMap<Type, ObjectI>();
	
	public enum Type{
		
		TYPE_1, TYPE_2, TYPE_3;
		
	}

	public static ObjectI getObject(Type type) {
		
		ObjectI heavyLoadObject = objectsCreated.get(type);
		
		if(heavyLoadObject==null){
			switch(type) {
			case TYPE_1:
				heavyLoadObject = new HeavyLoadObject(type);
				break;
			case TYPE_2:
				
				break;
			case TYPE_3:
				
				break;
			}
		}
		objectsCreated.put(type, heavyLoadObject);
		
		return heavyLoadObject;
	}


	public static int checkCreatedObjectCount() {
		return objectsCreated.size();
	}
}
