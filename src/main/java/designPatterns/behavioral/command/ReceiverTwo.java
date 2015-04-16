package designPatterns.behavioral.command;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class ReceiverTwo implements ReceiverI {

	/**
	 * @see designPatterns.behavioral.command.ReceiverI#doReceiverAction()
	 */
	@Override
	public String doReceiverAction() {
		return "ReveiverTwo";
	}

}
