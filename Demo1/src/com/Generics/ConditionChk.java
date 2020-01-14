///*
//package com.Generics;
//
//public class ConditionChk<T> {
//   private T[] arr = (T[])(new Object[100]);
//    private int size = 0;
//
//    public void addValue(T val){
//
//
//        if(size<100){
//            arr[size]=val;
//            size++;
//        }else {
//            System.out.println("Array is full!!");
//        }
//    }
//
//    public void deleteByIndex(T val1){
//
//        T deletedVal = arr[(int)val1];
//        for(int i=(int)val1;i<size;i++){
//            arr[i]=arr[i+1];
//        }
//        size--;
//        System.out.println(deletedVal+ " is deleted!!");
//    }
//
//    public void deleteByValue(T val2){
//
//        for(int i=0;i<size;i++){
//            if(arr[i]==val2){
//                for(int j=i;j<size;j++){
//                    arr[j]=arr[j+1];
//                }
//                size--;
//            }
//        }
//        System.out.println(val2 + " is deleted!!");
//    }
//
//    public T getFromIndex(T val3){
//        T data = arr[(int)val3];
//        if((int)val3 < size){
//
//            return data;
//        }else{
//            return data;
//        }
//
//    }
//
//    public void printArray(){
//
//        for(int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//
//}
//*/
