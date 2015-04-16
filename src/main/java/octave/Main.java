package octave;

import dk.ange.octave.OctaveEngine;
import dk.ange.octave.OctaveEngineFactory;
import dk.ange.octave.type.OctaveDouble;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class Main {

	public static void main(String[] args) {

		OctaveEngine octave = new OctaveEngineFactory().getScriptEngine();

		try {
			OctaveDouble matA = new OctaveDouble(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, 3, 5);
			octave.put("a", matA);
			octave.eval("a;");

			String matB = "b = [1,2,3; 4,5,6; 7,8,9];";
			octave.eval(matB);

			octave.eval("x = b(1,:)';");
			OctaveDouble varX = (OctaveDouble)octave.get("x");
//			System.out.println("Result: " + varX.get(1, 1) + " " + varX.get(1, 2) + " " + varX.get(1, 3));
			System.out.println("Result: " + varX.get(1) + " " + varX.get(2) + " " + varX.get(3));
//			System.out.println("Result: " + varX.get(2) + " " + varX.get(1, 3));
			
		}
		finally {
			octave.close();
		}

	}

}
