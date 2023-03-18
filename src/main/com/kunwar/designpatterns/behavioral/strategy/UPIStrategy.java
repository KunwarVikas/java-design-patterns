package main.com.kunwar.designpatterns.behavioral.strategy;

public class UPIStrategy implements IPaymentStrategy {

	private String name;
	private String upiId;

	public UPIStrategy(String name, String upiId){
		this.name=name;
		this.upiId=upiId;
	}
	@Override
	public void pay(double amount) {
		System.out.println("The "+ amount +" was paid using UPI");
	}

}