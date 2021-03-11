package com.patterns.behavioral.Iterator;

import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    BikeRepository repo = new BikeRepository();

    repo.addBike("Yamaha");
    repo.addBike("BMW");
    repo.addBike("Ninja");

    Iterator<String> bikeIterator = repo.iterator();

    //    while (bikeIterator.hasNext()) {
    //      System.out.println(bikeIterator.next());
    //    }

    for (String bike : repo) {
      System.out.println(bike);
    }
  }
}
