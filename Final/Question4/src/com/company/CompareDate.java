package com.company;

import java.util.Comparator;

public class CompareDate implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.releaseDate.getTime() == o2.releaseDate.getTime()) {
            return 0;
        }
        return o1.getReleaseDate().getTime() - o2.getReleaseDate().getTime() < 0 ? 1 : -1;
    }
}
