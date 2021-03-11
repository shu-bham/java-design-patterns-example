package com.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type)  {
        try {
           return (Item) items.get(type).clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Zorro");
        movie.setPrice(200.0);
        movie.setRuntime("2 hrs");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("white Tiger");
        book.setNumberOfPages(2500);
        book.setPrice(250.6);
        items.put("Book", book);

    }
}
