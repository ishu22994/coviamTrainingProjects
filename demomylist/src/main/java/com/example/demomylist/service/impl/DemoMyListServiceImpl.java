package com.example.demomylist.service.impl;

import com.example.demomylist.repository.DemoMyListRepoInterface;
import com.example.demomylist.repository.impl.DemoMyListRepoImpl;
import com.example.demomylist.service.DemoMyListServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pranav on 11/01/20.
 */
@Service
public class DemoMyListServiceImpl implements DemoMyListServiceInterface{

  @Autowired
  DemoMyListRepoImpl demoMyListRepo;


  @Override
  public int getByIndex(int index) {
    return demoMyListRepo.getByIndex(index);

  }


  @Override
  public int sumofAllNumber() {
      int sum=0;
      int size=demoMyListRepo.getSize();
      for(int i=0;i<size;i++){
        sum = sum+demoMyListRepo.getByIndex(i);
      }
      return  sum;
    }

    @Override
    public int add(int value) {
        return demoMyListRepo.add(value);
    }

    @Override
    public int deleteByValue(int value) {
        return demoMyListRepo.deleteByValue(value);
    }

    @Override
    public int deleteByIndexx(int value) {
        return demoMyListRepo.deleteByIndexx(value);
    }


}
