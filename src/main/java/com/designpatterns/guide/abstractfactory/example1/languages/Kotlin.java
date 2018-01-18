package com.designpatterns.guide.abstractfactory.example1.languages;

public class Kotlin extends AbstractLanguage implements Language{

    @Override
    public void setName(String name) {
        setLanguageName(name);
    }

    @Override
    public String getName() {
        return getLanguageName();
    }
}
