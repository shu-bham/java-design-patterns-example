package com.patterns.structural.facade;

import java.util.List;

public class FacadeJdbcDemo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        System.out.println("Table Created");

        jdbcFacade.insertIntoTable();
        System.out.println("Records Inserted");

        List<Address> addressList = jdbcFacade.getAddresses();
        for(Address address : addressList){
            System.out.println(address);
        }
    }
}
