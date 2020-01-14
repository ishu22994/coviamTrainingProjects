package com.example.demomylist.controller;

import com.example.demomylist.service.impl.DemoMyListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/mylist")
public class DemoMyListController {

  @Autowired
  DemoMyListServiceImpl demoMyListService;

  @GetMapping("/byindex/{index}")
  int getByIndex(@PathVariable("index") int index){
    return  demoMyListService.getByIndex(index);
  }

  @PostMapping("/add/{value}")
  int add(@PathVariable("value") int value){
    return demoMyListService.add(value);
  }

  @GetMapping("/sum")
  int sumOfAllNumber() {
    return  demoMyListService.sumofAllNumber();
  }

  @DeleteMapping("/delete/{value}")
  int deleteByValue(@PathVariable("value") int value){
    return demoMyListService.deleteByValue(value);
  }

  @DeleteMapping("/deleteByIndex/{index}")
  int deleteByIndex(@PathVariable("index") int index){
    return demoMyListService.deleteByIndexx(index);
  }

}
