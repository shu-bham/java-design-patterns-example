package com.patterns.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values){
        StringTokenizer stringTokenizer = new StringTokenizer(values, ",");
        if (stringTokenizer.hasMoreElements()){
            id = Integer.parseInt(stringTokenizer.nextToken());
        }
        if (stringTokenizer.hasMoreElements()){
            firstName = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()){
            lastName = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()){
            emailAddress = stringTokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
