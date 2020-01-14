package com.example.demomylist.repository.impl;

import com.example.demomylist.repository.DemoMyListRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pranav on 11/01/20.
 */
@Repository
public class DemoMyListRepoImpl implements DemoMyListRepoInterface {

  List<Integer> myList = new ArrayList<>();

  DemoMyListRepoImpl(){
    for(int i =0;i <100;i++)
    {
      myList.add(i);
    }
  }


  @Override
  public int getByIndex(int index) {
    return myList.get(index);
  }

  @Override
  public int getSize() {
    return myList.size();
  }

  @Override
  public int add(int value) {
    myList.add(value);
    return myList.size()-1;
  }

  @Override
  public int deleteByIndexx(int index) {
     myList.remove(index);
    return myList.size();
  }

  @Override
  public int deleteByValue(int value) {
    int flag=0;
    for (int i = 0; i < myList.size(); i++) {
      if (value == myList.get(i)) {
        myList.remove(value);
          flag++;
      }
    }
    if(flag != 0){
      return myList.size();
    }else{
      return -1;
    }

  }



}
