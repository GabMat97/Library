package com.company;

public class Main {
    public static void main (String[] args) {

        Fantasy fantasy = new Fantasy("Fantasy", "Lord of the Rings");
        System.out.println("Title: " + fantasy.getTitle() + "and its genre is " + fantasy.getGenre());

    }
}
