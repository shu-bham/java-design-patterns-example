package com.patterns.behavioral.template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
    System.out.println("Ring up items from cart");
    }

    @Override
    public void doPayment() {
    System.out.println("Process payment with card payment");
    }

    @Override
    public void doReceipt() {
    System.out.println("Print Receipt");
    }

    @Override
    public void doDelivery() {
    System.out.println("Bag items at counter");
    }
}
