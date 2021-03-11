package com.patterns.behavioral.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

  double shippingAmt = 0;

  @Override
  public void visit(Wheel wheel) {
    shippingAmt += 15;
    System.out.println("Wheels are bulky and expensive to ship");
  }

  @Override
  public void visit(Fender fender) {
    shippingAmt += 3;
    System.out.println("Fenders are light and cheap to ship");
  }

  @Override
  public void visit(Oil oil) {
    shippingAmt += 9;
    System.out.println("Oil is hazardous and free to ship");
  }

  @Override
  public void visit(PartsOrder order) {
    System.out.println("If they bought more than 3 things we will give 'em  a shipping discount");
    List<AtvPart> parts = order.getParts();
    if (parts.size() > 3) {
      shippingAmt -= 5;
    }
    System.out.println("Shipping Amount is: " + shippingAmt);
  }
}
