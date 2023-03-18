package main.com.kunwar.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kunwar
 */
public class ShoppingCart {

	//List of items
	List<Stuff> stuffList;
	
	public ShoppingCart(){
		this.stuffList =new ArrayList<Stuff>();
	}
	
	public void addStuff(Stuff stuff){
		this.stuffList.add(stuff);
	}
	
	public void removeStuff(Stuff stuff){
		this.stuffList.remove(stuff);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Stuff stuff : stuffList){
			sum += stuff.getPrice();
		}
		return sum;
	}
	
	public void pay(IPaymentStrategy paymentMethod){
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}