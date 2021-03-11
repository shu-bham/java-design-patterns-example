package com.patterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        System.out.println(employeeClient.getEmployeeList());
    }
}
