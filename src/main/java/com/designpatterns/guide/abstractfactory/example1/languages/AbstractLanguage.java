package com.designpatterns.guide.abstractfactory.example1.languages;

public abstract class AbstractLanguage {

    private String name;

    protected void setLanguageName(String name) {
        this.name = name;
    }

    protected String getLanguageName() {
        return this.name;
    }
}
