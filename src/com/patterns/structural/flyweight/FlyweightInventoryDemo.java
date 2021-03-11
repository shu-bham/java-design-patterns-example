package com.patterns.structural.flyweight;

public class FlyweightInventoryDemo {

  public static void main(String[] args) {
    InventorySystem ims = new InventorySystem();
    ims.takeOrder("Roomba", 221);
    ims.takeOrder("aa", 111);
    ims.takeOrder("bb", 222);
    ims.takeOrder("cc", 333);
    ims.takeOrder("dd", 444);
    ims.takeOrder("Ee", 555);
      ims.takeOrder("aa", 112);
      ims.takeOrder("bb", 223);
      ims.takeOrder("cc", 334);
      ims.takeOrder("dd", 445);
      ims.takeOrder("Ee", 556);

    ims.process();

    System.out.println(ims.printReport());
  }
}
