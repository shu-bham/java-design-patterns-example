package com.patterns.behavioral.strategy;

public class StrategyDemo {

  public static void main(String[] args) {
    CreditCard creditCard = new CreditCard(new AmexStrategy());
    creditCard.setNumber("379185883464283");
    creditCard.setCvv("123");
    creditCard.setDate("04/2020");
    System.out.println("Is Amex Valid: " + creditCard.isValid());

    CreditCard creditCard2 = new CreditCard(new AmexStrategy());
    creditCard2.setNumber("379185883464282");
    creditCard2.setCvv("123");
    creditCard2.setDate("04/2020");
    System.out.println("Is Amex Valid: " + creditCard2.isValid());

      CreditCard visaCard = new CreditCard(new VisaStrategy());
      visaCard.setNumber("4539589763663402");
      visaCard.setCvv("123");
      visaCard.setDate("04/2020");
      System.out.println("Is Visa Valid: " + visaCard.isValid());


  }
}
