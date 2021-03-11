package com.patterns.structural.bridge;

public class Detail {
    private String value, label;

    public Detail(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
}
