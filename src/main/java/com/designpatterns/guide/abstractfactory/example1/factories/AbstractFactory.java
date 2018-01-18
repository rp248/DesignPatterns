package com.designpatterns.guide.abstractfactory.example1.factories;

import com.designpatterns.guide.abstractfactory.example1.languages.Language;

/**
 * An Interface to create families of related objects. Here Java, Kotlin are related
 * to same family "Language"
 */
public interface AbstractFactory {
    Language createJava();
    Language createKotlin();
}
