package com.example.demomylist.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Pranav on 11/01/20.
 */

public interface DemoMyListRepoInterface {
  int  getByIndex(int index);
  int getSize();
  int add(int value);

  int deleteByValue(int value);

  int deleteByIndexx(int value);

}
