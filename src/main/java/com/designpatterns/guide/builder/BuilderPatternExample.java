package com.designpatterns.guide.builder;

import com.designpatterns.guide.builder.builders.RainbowProduction;
import com.designpatterns.guide.builder.director.MovieDirector;
import com.designpatterns.guide.builder.models.Movie;

public class BuilderPatternExample {
    public static void main(String a[]) {
        RainbowProduction rainbowProduction = new RainbowProduction();
        MovieDirector movieDirector = new MovieDirector();
        Movie movie = movieDirector.produceMovie(rainbowProduction);
    }
}
