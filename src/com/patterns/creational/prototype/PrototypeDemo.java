package com.patterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

//        String sql = "select * from movies where title = ?";
//        List<String> param = new ArrayList<>();
//        param.add("Star Wars");
//        Record record = new Record();
//        Statement firstStatement = new Statement(sql, param, record);
//        System.out.println(firstStatement.getSql());
//        System.out.println(firstStatement.getParameters());
//        System.out.println(firstStatement.getRecord());
//        Statement secondStatement = firstStatement.clone();
//        System.out.println(secondStatement.getSql());
//        System.out.println(secondStatement.getParameters());
//        System.out.println(secondStatement.getRecord());

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
//        Book book = (Book) registry.createItem("Book");
        movie.setTitle("POTC");
        System.out.println(movie);
        System.out.println(movie.getTitle());;
        System.out.println(movie.getPrice());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Wasseypur");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());;
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getUrl());



    }
}
