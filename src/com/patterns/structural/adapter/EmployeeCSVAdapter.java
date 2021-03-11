package com.patterns.structural.adapter;

public class EmployeeCSVAdapter implements Employee{
    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV){
        this.instance = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getFirstName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
