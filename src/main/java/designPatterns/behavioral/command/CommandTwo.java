package designPatterns.behavioral.command;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class CommandTwo implements CommandI {

	private final ReceiverI receiver;

	/**
	 * @param receiver
	 */
	public CommandTwo(ReceiverI receiver) {
		this.receiver = receiver;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see designPatterns.behavioral.command.CommandI#execute()
	 */
	@Override
	public String execute() {
		return "CommandTwo"+ receiver.doReceiverAction();
	}

}
