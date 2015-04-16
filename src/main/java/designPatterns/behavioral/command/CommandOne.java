package designPatterns.behavioral.command;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class CommandOne implements CommandI {

	private final ReceiverI receiver;

	/**
	 * @param receiver
	 */
	public CommandOne(ReceiverI receiver) {
		this.receiver = receiver;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see designPatterns.behavioral.command.CommandI#execute()
	 */
	@Override
	public String execute() {
		return "CommandOne"+receiver.doReceiverAction();
	}

}
