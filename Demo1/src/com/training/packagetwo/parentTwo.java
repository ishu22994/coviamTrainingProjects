package com.training.packagetwo;

import com.training.packageOne.parentOne;

public class parentTwo extends parentOne{

    public static void main(String[] args) {
        parentOne obj1 = new parentOne();
        System.out.println("One = " + obj1.valOne +"Two = " +obj1.valTwo+ "Three = " +obj1.valThree+ "Four = "+obj1.valFour);
    }}
