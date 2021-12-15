package com.company;

import java.util.Comparator;

public class QueueByTitle implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.getTitle().equals(o2.getTitle())) {
            return 0;
        }
        return o1.getTitle().compareTo(o2.getTitle()) < 0 ? -1 : 1;
    }
}
