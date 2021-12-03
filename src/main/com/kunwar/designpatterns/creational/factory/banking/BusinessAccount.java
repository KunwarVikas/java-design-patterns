package main.com.kunwar.designpatterns.creational.factory.banking;

/**
 * @author Kunwar
 */
public class BusinessAccount implements BankAccount {
    @Override
    public void registerAccount() {
        System.out.println("Creating a business account");
    }
}
