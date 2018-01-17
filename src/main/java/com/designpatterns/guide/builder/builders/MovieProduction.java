package com.designpatterns.guide.builder.builders;

import com.designpatterns.guide.builder.models.Movie;

public interface MovieProduction {
    void buildStory();
    void buildProducer();
    void buildCrew();
    void buildCast();
    Movie buildMovie();
}
