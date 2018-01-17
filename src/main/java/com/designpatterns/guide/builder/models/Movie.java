package com.designpatterns.guide.builder.models;


public interface Movie {
    void setStory(String story);
    void setProducer(String producer);
    void setCrew(String ...crew);
    void setCast(String ...cast);
}
