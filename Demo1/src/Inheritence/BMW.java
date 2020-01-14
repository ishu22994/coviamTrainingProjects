package Inheritence;

public class BMW extends Car {
    public BMW() {

        setAutodriveSupported(true);

    }

    public void breaks() {
        System.out.println("I am breaking BMW");
    }

    @Override
    public void drive() {
        System.out.println("I am driving BMW");
    }



}
