package com.training.packageOne;

public class parentOne {

    public int valOne;
    public String valTwo;
    public int valThree;
    public String valFour;

    public parentOne(){

    }

    public parentOne(int valOne, String valTwo, int valThree, String valFour) {
        this.valOne = valOne;
        this.valTwo = valTwo;
        this.valThree = valThree;
        this.valFour = valFour;
    }


    public int getValOne() {
        return valOne;
    }

    public void setValOne(int valOne) {
        this.valOne = valOne;
    }

    public String getValTwo() {
        return valTwo;
    }

    public void setValTwo(String valTwo) {
        this.valTwo = valTwo;
    }

    public int getValThree() {
        return valThree;
    }

    public void setValThree(int valThree) {
        this.valThree = valThree;
    }

    public String getValFour() {
        return valFour;
    }

    public void setValFour(String valFour) {
        this.valFour = valFour;
    }



}
