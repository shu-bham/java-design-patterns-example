package com.patterns.creational.abstractFactory;

public abstract class CreditCard {
    protected int cardNumbersLength;
    protected int cscNumber;

    public int getCardNumbersLength() {
        return cardNumbersLength;
    }

    public void setCardNumbersLength(int cardNumbersLength) {
        this.cardNumbersLength = cardNumbersLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
