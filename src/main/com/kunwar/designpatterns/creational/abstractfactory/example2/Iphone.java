package main.com.kunwar.designpatterns.creational.abstractfactory.example2;

/**
 * Iphone Mobile
 */
public class Iphone implements IMobile {
    @Override
    public void brandName() {
        System.out.println("The brand name is Iphone");
    }
}