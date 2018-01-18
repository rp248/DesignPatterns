package com.designpatterns.guide.abstractfactory.example1.demo;

import com.designpatterns.guide.abstractfactory.example1.factories.AbstractFactory;
import com.designpatterns.guide.abstractfactory.example1.languages.Language;

/**
 * CLient
 */
public class Client {
    private Language java;
    private Language kotlin;

    private AbstractFactory abstractFactory;

    public Client(AbstractFactory abstractFactory) {

        /* Hard-wring dependencies. If we create required dependencies directly here, we
        can't make changes to the dependencies with out touching this class.
        java = new Java();
        java.setName("Java");

        kotlin = new Kotlin();
        kotlin.setName("Kotlin");
        */

        this.abstractFactory = abstractFactory;
        createRequiredDependencies();
    }

    private void createRequiredDependencies() {
        /**
         * Using this Abstract Factory Method Pattern We can change dependencies without
         * touching this class.
         * Example : We can change the name of the language
         * java.setName("Java1.8");
         */
        java = abstractFactory.createJava();
        kotlin = abstractFactory.createKotlin();
    }

    public void displayNames() {
        System.out.println(java.getName());
        System.out.println(kotlin.getName());
    }
}
