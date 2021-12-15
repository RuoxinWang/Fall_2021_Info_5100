package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {
    public String title;
    public String genre;
    public Date releaseDate;
    public String actors;
    public String director;

    public Movie(String title, String genre, String releaseDate, String actors, String director){
        this.title = title;
        this.genre = genre;
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            try{
                this.releaseDate = date.parse(String.valueOf(releaseDate));
            } catch (Exception e) {
                e.printStackTrace();
            }
        this.actors = actors;
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
