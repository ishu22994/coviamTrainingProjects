package Inheritence;

public class Nano extends Car {


    public Nano() {
        setAutodriveSupported(false);
    }

    @Override
    public void drive() {
        System.out.println("I am driving Nano");
    }

    public void breaks() {
    }
}
