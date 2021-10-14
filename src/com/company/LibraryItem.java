package com.company;
public abstract class LibraryItem {

    ////////////////Attributes/////////////////
    private String name;

    ////////////////Constructor////////////////
    public LibraryItem(String name) {
        this.name = name;
    }

    ////////////////Methods///////////////
    public void book(){
        System.out.println("I am a book");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
