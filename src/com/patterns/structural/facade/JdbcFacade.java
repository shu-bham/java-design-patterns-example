package com.patterns.structural.facade;

import com.patterns.creational.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton dbSingleton = null;

    public JdbcFacade(){
        dbSingleton = DbSingleton.getInstance();
    }
    public  int createTable(){
        int count = 0;
        try {
            Connection conn = null;
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE ADDRESS(ID INTEGER, STREETNAME "
                    + "VARCHAR(20), CITY VARCHAR(20)");
            System.out.println("Table Created!");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    public int insertIntoTable(){
        int count = 0;
        try {
            Statement sta = null;
            count = sta.executeUpdate("INSERT INTO ADDRESS(ID, STREETNAME, CITY) " +
                    "VALUES(1, 'some street', 'some city'");
            System.out.println(count + " record(s) created.");
            sta.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    public List<Address> getAddresses(){
        List<Address> addresses = new ArrayList<>();
        try {
            Statement sta = null;
            ResultSet rs = sta.executeQuery("SELECT * from ADDRESS");

            while (rs.next()){
                Address address = new Address();
                address.setId(rs.getString(1));
                address.setStreetName(rs.getString(2));
                address.setCity(rs.getString(3));
                addresses.add(address);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }
}

class Address{
    private String id;
    private String streetName;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
