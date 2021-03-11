package com.patterns.creational.abstractFactory;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType){
        switch (cardType){
            case GOLD: return new VisaGoldCreditCard();
            case PLATINUM:return new VisaPlatinumCreditCard();
        }
        return null;
    }

    public Validator getValidator(CardType cardType){
        return new VisaValidator();
    }

}
