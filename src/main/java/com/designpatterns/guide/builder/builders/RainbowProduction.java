package com.designpatterns.guide.builder.builders;

import com.designpatterns.guide.builder.models.Documentary;
import com.designpatterns.guide.builder.models.Movie;

public class RainbowProduction implements MovieProduction {

    private Movie movie;

    public RainbowProduction() {
        this.movie = new Documentary();
    }

    @Override
    public void buildStory() {
        movie.setStory("sample story");
    }

    @Override
    public void buildProducer() {
        movie.setProducer("Rainbow");
    }

    @Override
    public void buildCrew() {
        movie.setCrew("sample crew");
    }

    @Override
    public void buildCast() {
        movie.setCast("sample cast");
    }

    @Override
    public Movie buildMovie() {
        return this.movie;
    }
}
