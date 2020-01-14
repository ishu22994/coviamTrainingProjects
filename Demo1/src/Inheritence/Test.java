package Inheritence;

public class Test {

    public static void main(String[] args) {
        BMW b = new BMW();
        b.drive();
        System.out.println("BMW  = "+b.isAutodriveSupported);

        Nano n = new Nano();
        n.drive();
        System.out.println("Nano = "+n.isAutodriveSupported);

        Car c = new Nano();
        c.drive();
        System.out.println("Car = "+c.isAutodriveSupported);

        Car c1 = new BMW();
        ((BMW)c1).breaks();

        VehicleInterface v = new BMW();
    ((BMW) v).breaks();
    v.drive();
    }

}
