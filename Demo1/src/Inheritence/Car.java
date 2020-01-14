package Inheritence;

public  class Car implements VehicleInterface {

    private int numberOfWheels;
    protected boolean isAutodriveSupported;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setAutodriveSupported() {

    }

    public boolean isAutodriveSupported() {
        return isAutodriveSupported;
    }

    public void setAutodriveSupported(boolean autodriveSupported) {
        isAutodriveSupported = autodriveSupported;
    }

    {
        numberOfWheels = 4;
    }

    public void drive(){

        System.out.println("I am driving Car!!");

    }



}
