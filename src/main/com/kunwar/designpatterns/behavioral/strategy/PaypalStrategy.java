package main.com.kunwar.designpatterns.behavioral.strategy;

/**
 * @author Kunwar
 */
public class PaypalStrategy implements IPaymentStrategy {

	private String paypalId;
	
	public PaypalStrategy(String paypalId){
		this.paypalId=paypalId;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("The " + amount + " was paid using Paypal.");
	}

}