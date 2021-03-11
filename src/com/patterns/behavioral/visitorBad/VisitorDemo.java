package com.patterns.behavioral.visitorBad;

public class VisitorDemo {
  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    order.addPart(new Wheel());
    order.addPart(new Fender());
    order.addPart(new Oil());

    double v = order.calculateShipping();
    System.out.println("Shipping cost: " + v);
  }
}
