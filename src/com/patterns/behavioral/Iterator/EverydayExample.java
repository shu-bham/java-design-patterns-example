package com.patterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EverydayExample {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Ram");
    names.add("Naresh");
    names.add("Roy");

    Iterator<String> iterator = names.iterator();

//    while (iterator.hasNext()) {
//      String name = iterator.next();
//      System.out.println(name);
//      iterator.remove();
//    }

    for (String name : names ) {
      System.out.println(name);
    }

    System.out.println("Names size:" + names.size()) ;
  }
}
