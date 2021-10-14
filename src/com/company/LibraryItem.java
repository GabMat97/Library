package com.company;
public abstract class LibraryItem {

    ////////////////Attributes/////////////////
    private String genre;
    private String title;

    ////////////////Constructor////////////////
    public LibraryItem(String genre, String title) {
        this.genre = genre;
        this.title = title;
    }

    ////////////////Methods///////////////
    public void book(){
        System.out.println("I am a book");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
