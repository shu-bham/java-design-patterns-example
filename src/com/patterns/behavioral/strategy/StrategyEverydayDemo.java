package com.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StrategyEverydayDemo {

  private static void printContent(List<Person> people) {
    for (Person p : people) {
      System.out.println(p.getName());
    }
  }

  public static void main(String[] args) {
    Person ameya = new Person(25, "Ameya", "11223344");
    Person mayur = new Person(26, "Mayur", "33445555");
    Person naman = new Person(23, "Naman", "11335566");

    List<Person> people = new ArrayList<>();
    people.add(ameya);
    people.add(mayur);
    people.add(naman);

    System.out.println("Not Sorted");
    printContent(people);

    Collections.sort(
        people,
        (o1, o2) -> {
          if (o1.getAge() > o2.getAge()) return 1;
          if (o1.getAge() < o2.getAge()) return -1;

          return 0;
        });

    System.out.println("Sorted by Age");
    printContent(people);

    Collections.sort(people, (o1, o2) -> o1.getName().compareTo(o2.getName()));

    System.out.println("Sorted by Name");
    printContent(people);
  }
}
