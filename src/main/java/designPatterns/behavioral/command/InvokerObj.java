package designPatterns.behavioral.command;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class InvokerObj implements InvokerI {

	/**
	 * @see designPatterns.behavioral.command.InvokerI#doAction(designPatterns.behavioral.command.CommandI)
	 */
	@Override
	public String doAction(CommandI command) {
		return command.execute();
	}

}
