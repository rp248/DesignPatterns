package com.designpatterns.guide.abstractfactory.example1.factories;

import com.designpatterns.guide.abstractfactory.example1.languages.Java;
import com.designpatterns.guide.abstractfactory.example1.languages.Kotlin;
import com.designpatterns.guide.abstractfactory.example1.languages.Language;

public class LanguageFactory implements AbstractFactory {

    @Override
    public Language createJava() {
        Java java = new Java();
        java.setName("Java");
        return  java;
    }

    @Override
    public Language createKotlin() {
        Kotlin kotlin = new Kotlin();
        kotlin.setName("Kotlin");
        return kotlin;
    }
}
