package com.patterns.structural.facade;

import com.patterns.creational.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();

        try {
            Connection conn = null;
            Statement sta = conn.createStatement();
            int count = sta.executeUpdate("CREATE TABLE ADDRESS(ID INTEGER, STREETNAME "
                    + "VARCHAR(20), CITY VARCHAR(20)");
            System.out.println("Table Created!");
            sta.close();

            sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO ADDRESS(ID, STREETNAME, CITY) " +
            "VALUES(1, 'some street', 'some city'");
            System.out.println(count + " record(s) created.");
            sta.close();

            sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * from ADDRESS");

            while (rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
