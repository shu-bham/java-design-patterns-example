package com.patterns.creational.abstractFactory;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType){
        switch (cardType){
            case GOLD: return new AmexGoldCreditCard();
            case PLATINUM: return new AmexPlatimunCreditCard();
        }
        return null;
    }

    public Validator getValidator(CardType cardType){
        switch (cardType){
            case PLATINUM: return new AmexPlatinumValidator();
            case GOLD: return new AmexGoldValidator();
        }

        return null;
    }
}
