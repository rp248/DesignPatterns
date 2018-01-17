package com.designpatterns.guide.builder.director;

import com.designpatterns.guide.builder.builders.MovieProduction;
import com.designpatterns.guide.builder.models.Movie;

public class MovieDirector {
    public Movie produceMovie(MovieProduction movieProduction) {
        movieProduction.buildStory();
        movieProduction.buildProducer();
        movieProduction.buildCrew();
        movieProduction.buildCast();
        return movieProduction.buildMovie();
    }
}
