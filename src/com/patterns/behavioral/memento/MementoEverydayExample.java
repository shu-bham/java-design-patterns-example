package com.patterns.behavioral.memento;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEverydayExample {

  public static Employee deserialize() {
    Employee emp = null;
    try (FileInputStream fileInputStream = new FileInputStream("/tmp/employee.ser")) {
      ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
      emp = (Employee) inputStream.readObject();
      inputStream.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return emp;
  }

  public static void serialize(Employee employee) {

    try (FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser")) {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(employee);
      objectOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.setName("Rod Tucker");
    emp.setAddress("Ville Parle West");
    emp.setPhone("999-111-3333");

    serialize(emp);

    Employee newEmp = deserialize();

    if (newEmp != null) System.out.println(newEmp.getName());
  }
}
