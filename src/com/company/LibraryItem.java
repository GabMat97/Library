package com.company;
public abstract class LibraryItem {

    ////////////////Attributes/////////////////
    private String genre;
    private String title;
    private Integer pages;

    ////////////////Constructor////////////////
    public LibraryItem(String genre, String title, Integer pages) {
        this.genre = genre;
        this.title = title;
        this.pages = pages;
    }

    ////////////////Methods///////////////
    public void book(){
        System.out.println("I am a book");
    }

    public Integer getPages(Integer pages) {
        return pages;
    }

//    public Integer setPages(Integer pages) {
//        this.pages = pages;
//    }

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
