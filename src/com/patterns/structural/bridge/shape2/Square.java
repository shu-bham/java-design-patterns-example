package com.patterns.structural.bridge.shape2;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public void applyColor(){
        color.applyColor();
    }
}
