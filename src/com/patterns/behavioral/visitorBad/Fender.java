package com.patterns.behavioral.visitorBad;

public class Fender implements AtvPart{
    @Override
    public double calculateShipping() {
        return 3;
    }
}
