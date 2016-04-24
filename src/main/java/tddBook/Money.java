package tddBook;

/**
 * 
 * @author Mariusz Lewandowski; byMario.pl
 */
public class Money implements Expression {

	protected int amount;
	protected String currency;

	public Expression times(int multiplication){
		return new Money(amount * multiplication, currency);
	}
	
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}



	public static Money dollar(int amount){
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount){
		return new Money(amount, "CHF");
	}
	
	@Override
	public boolean equals(Object obj) {
		Money m = (Money)obj;
		return this.amount==m.amount
				&& currency().equals(m.currency());
	}

	public String currency() {
		return currency;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + ", currency=" + currency + "]";
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
		
	}

	public Money reduce(Bank bank, String to){
		int rate = bank.rate(currency, to);

		return new Money(amount/rate, to);
	}
}
