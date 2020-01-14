package com.training.packageOne;

public class childOne {

    private int childValOne;
    protected String childValTwo;
    public int childValThree;
    String childValFour;

    public childOne(){

    }

    public childOne(int childValOne, String childValTwo, int childValThree, String childValFour) {
        this.childValOne = childValOne;
        this.childValTwo = childValTwo;
        this.childValThree = childValThree;
        this.childValFour = childValFour;
    }

    public int getChildValOne() {
        return childValOne;
    }

    public void setChildValOne(int childValOne) {
        this.childValOne = childValOne;
    }

    public String getChildValTwo() {
        return childValTwo;
    }

    public void setChildValTwo(String childValTwo) {
        this.childValTwo = childValTwo;
    }

    public int getChildValThree() {
        return childValThree;
    }

    public void setChildValThree(int childValThree) {
        this.childValThree = childValThree;
    }

    public String getChildValFour() {
        return childValFour;
    }

    public void setChildValFour(String childValFour) {
        this.childValFour = childValFour;
    }

    public static void main(String[] args) {
        parentOne obj1 = new parentOne();
        System.out.println("One = " + obj1.getValOne() +"Two = " +obj1.valTwo+ "Three = " +obj1.valThree+ "Four = "+obj1.valFour );
    }
}
