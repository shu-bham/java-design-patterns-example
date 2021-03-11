package com.patterns.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("action");
        movie.setRuntime("2.15");
        movie.setTitle("iron man");
        movie.setYear("2006");

        Formatter printFormatter = new PrintFormatter();

        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        Formatter htmlFormatter = new HtmlFormatter();

        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(printedMaterial);
        System.out.println(htmlMaterial);



    }
}
