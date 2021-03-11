package com.patterns.behavioral.visitorBad;

public class Wheel implements AtvPart {
    @Override
    public double calculateShipping() {
        return 12;
    }
}
