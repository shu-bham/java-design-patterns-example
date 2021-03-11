package com.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDb = new EmployeeDB("123", "aang", "chan", "sss@gg.com");
        employees.add(employeeFromDb);

//        Employee employeeFromLdap = new EmployeeLdap("115", "carry", "minati", "yolo@rr.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("115", "carry", "minati", "yolo@rr.com");
        employees.add(new EmployeeLdapAdapter(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("111,Ramon,Clint,sss@ttt.com");
        employees.add(new EmployeeCSVAdapter(employeeCSV));

        return employees;
    }
}
