package com.training.designPatteren;

public class CheckSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 +" \n "+s2);

    }

}
