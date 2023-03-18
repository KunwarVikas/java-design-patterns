package main.com.kunwar.designpatterns.behavioral.strategy;

/**
 * @author Kunwar
 */
public class Stuff {

	private String barCode;
	private double price;
	
	public Stuff(String upc, int cost){
		this.barCode =upc;
		this.price=cost;
	}

	public String getBarCode() {
		return barCode;
	}

	public double getPrice() {
		return price;
	}
	
}