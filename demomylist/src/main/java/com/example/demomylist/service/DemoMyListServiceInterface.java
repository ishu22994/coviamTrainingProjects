package com.example.demomylist.service;

/**
 * Created by Pranav on 11/01/20.
 */

public interface DemoMyListServiceInterface {
  int  getByIndex(int index);
  int sumofAllNumber();
  int add(int value);
  int deleteByValue(int value);


  int deleteByIndexx(int value);

}
