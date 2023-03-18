package main.com.kunwar.designpatterns.behavioral.strategy;

/**
 * @author Kunwar
 */
public class DebitCardStrategy implements IPaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public DebitCardStrategy(String name, String cardNumber, String cvv, String expiryDate){
		this.name=name;
		this.cardNumber=cardNumber;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	@Override
	public void pay(double amount) {
		System.out.println("The " + amount +" was paid using a debit card");
	}

}