package com.patterns.behavioral.memento;


public class MementoDemo {
  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();
    Employee emp = new Employee();

    emp.setName("ramesh");
    emp.setAddress("vadodara");
    emp.setPhone("420");

    System.out.println("Employee before save:" + emp);

    caretaker.save(emp);

    emp.setPhone("520");
    caretaker.save(emp);

    System.out.println("Employee after changed phone no. save:" + emp);

    emp.setPhone("620");
    caretaker.revert(emp);

    System.out.println("Reverts to last save point:" + emp);

    caretaker.revert(emp);

    System.out.println("Reverts to original:" + emp);
  }
}
