package designPatterns.behavioral.command;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class CommandTest {

	@Test
	public void test() {
		//recive command and do the action
		ReceiverI receiverOne = new ReceiverOne();
		ReceiverI receiverTwo = new ReceiverTwo();

		//invoke the command and pass it to receiver
		InvokerI invoker = new InvokerObj();
		
		//command that invoker passes to receiver to do the action
		CommandI commandOneOne = new CommandOne(receiverOne);
		CommandI commandTwoOne = new CommandTwo(receiverOne);
	
		CommandI commandOneTwo = new CommandOne(receiverTwo);
		CommandI commandTwoTwo = new CommandTwo(receiverTwo);
		
		assertEquals("CommandOneReveiverOne", invoker.doAction(commandOneOne));
		assertEquals("CommandTwoReveiverOne", invoker.doAction(commandTwoOne));
		assertEquals("CommandOneReveiverTwo", invoker.doAction(commandOneTwo));
		assertEquals("CommandTwoReveiverTwo", invoker.doAction(commandTwoTwo));
		
		
		
		
	}

}
