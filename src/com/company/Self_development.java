package com.company;

public class Self_development extends LibraryItem {
    private String title;
    private String genre;

    public Self_development(String title, String genre) {
        super();
        this.title = title;
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
