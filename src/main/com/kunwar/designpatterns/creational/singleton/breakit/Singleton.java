package main.com.kunwar.designpatterns.creational.singleton.breakit;

/**
 * @author Kunwar
 */
class Singleton{
    public static Singleton instance = new Singleton();
    private Singleton() {
    }
}