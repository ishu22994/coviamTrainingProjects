package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class basicCollection {


    public static void main(String[] args) {
        ListMethod listMethod = new ListMethod();

        for(int i=0;i<13;i++){
           listMethod.addVal(i);
       }

       listMethod.forEachOddPrint();
       listMethod.sumOfEven();
       listMethod.iterOddPrint();
       listMethod.iterSumEven();
       listMethod.streamOddPrint();
       listMethod.streamSumEven();
       listMethod.streamTen();
    }
}
