package com.patterns.creational.singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton(){
        if (instance != null) {
            System.out.println("Use getInstance() to create");
        }
    }

    public static DbSingleton getInstance(){
//        lazily loading & thread-safe
        if (instance == null) {
            synchronized (DbSingleton.class){
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
