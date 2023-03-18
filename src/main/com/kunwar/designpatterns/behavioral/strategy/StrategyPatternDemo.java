package main.com.kunwar.designpatterns.behavioral.strategy;

/**
 * @author Kunwar
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Stuff stuff1 = new Stuff("1234",10);
		Stuff stuff2 = new Stuff("5678",40);
		
		cart.addStuff(stuff1);
		cart.addStuff(stuff2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("KV12345"));

		//pay by UPI
		cart.pay(new UPIStrategy("KV", "KV12345"));

		//pay by credit card
		cart.pay(new CreditCardStrategy("KV", "1234567890123456", "311", "12/28"));

		//pay by debit card
		cart.pay(new DebitCardStrategy("KV", "1234567890123456", "311", "12/28"));
	}

}