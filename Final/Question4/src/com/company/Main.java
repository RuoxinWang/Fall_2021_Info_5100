package com.company;

import com.sun.jdi.VMOutOfMemoryException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Movie M1 = new Movie("M1", "Action", "1998-01-01", "A1, A2, A3", "D1");
        Movie M2 = new Movie("M2", "Action", "2001-01-01", "A3, A4", "D2");
        Movie M3 = new Movie("M3", "Love", "2002-01-01", "A1, A4", "D2");
        Movie M4 = new Movie("M4", "Kid", "1997-01-01", "A2, A5, A6", "D3");
        Movie M5 = new Movie("M5", "Holiday", "2003-01-01", "A1, A4, A5", "D4");

        PriorityQueue<Movie> lastReleased = new PriorityQueue<>(new CompareDate());
        lastReleased.offer(M1);
        lastReleased.offer(M2);
        lastReleased.offer(M3);
        lastReleased.offer(M4);
        lastReleased.offer(M5);
        System.out.println("The last 3 released movies are: ");
        for (int i = 0; i < 3; i++) {
            Movie tar = lastReleased.poll();
            System.out.println(tar.getTitle());
        }

        PriorityQueue<Movie> queueByTitle = new PriorityQueue<>(new QueueByTitle());
        queueByTitle.offer(M1);
        queueByTitle.offer(M2);
        queueByTitle.offer(M3);
        queueByTitle.offer(M4);
        queueByTitle.offer(M5);
        System.out.println("Sorting by Title: ");
        for(int i = 0; i < 5; i++){
            Movie tar = queueByTitle.poll();
            System.out.println(tar.getTitle());
        }

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(M1);
        movieList.add(M2);
        movieList.add(M3);
        movieList.add(M4);
        movieList.add(M5);

        Predicate<Movie> between1990and2000 = movie -> movie.getReleaseDate().getTime() > 1990 && movie.getReleaseDate().getTime() < 2000;

        movieList.stream()
                .filter(movie -> movie.getReleaseDate().getTime() < 2000)
                .forEach(movie -> System.out.println(movie.getTitle() + "(Classic)"));

        movieList.stream()
                .forEach(movie -> System.out.println(movie.getTitle() + "(" + movie.getReleaseDate() + ")"));
    }

}
