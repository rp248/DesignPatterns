package com.designpatterns.guide.abstractfactory.example1.demo;

import com.designpatterns.guide.abstractfactory.example1.factories.AbstractFactory;
import com.designpatterns.guide.abstractfactory.example1.factories.LanguageFactory;

public class Example1Demo {

    public static void main(String a[]) {
        AbstractFactory abstractFactory = new LanguageFactory();
        Client client = new Client(abstractFactory);
        client.displayNames();
    }
}
