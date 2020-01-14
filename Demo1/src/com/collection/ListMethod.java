package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListMethod {

    ArrayList<Integer> list = new ArrayList<Integer>();
    public void forEachOddPrint(){

        for (Integer integer : list){
            if(integer %2 != 0){
                System.out.println(integer +" ");
            }
        }
        System.out.println();
    }

    public void addVal(int val){

        list.add(val);

    }

    public void sumOfEven(){

        int sum = 0;
        for(Integer integer : list){
            if(integer%2 == 0){
                sum += integer;
            }
        }
        System.out.println("Sum of Even Numbers For Each: "+ sum);
    }

    //////////////////////////////////////////////all above are in for each loop
    //////////////////////////////////////////////all below are in iterator method

    public void iterOddPrint(){

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){

            int temp = (int)iterator.next();
            if(temp %2 != 0){
                System.out.println(temp+" ");

            }
        }
    }

    public void iterSumEven(){
        int sum=0;

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            int temp = (int)iterator.next();
            if(temp%2 == 0){
                sum += temp;
            }
        }
        System.out.println("Sum of Even Numbers Iterators : "+ sum);
    }

    //////////////////////////////////////////////all below are in Stream method

    public void streamOddPrint(){

        list.stream().filter(intNum -> {
            return intNum % 2 != 0;
        }).forEach(intNum -> System.out.println(intNum+" Stream "));
        System.out.println();
    }

    public void streamSumEven(){

     int sum = list.stream().filter(intNum -> {
            return intNum % 2 == 0;
        }).mapToInt(Integer::intValue).sum();
        System.out.println("Sum with stream: "+sum);
    }

    public void streamTen(){
        list.stream().limit(10).forEach(intNum -> System.out.println(intNum + " "));
    }


}
