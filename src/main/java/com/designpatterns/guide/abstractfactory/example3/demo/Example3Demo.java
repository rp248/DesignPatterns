package com.designpatterns.guide.abstractfactory.example3.demo;

import com.designpatterns.guide.abstractfactory.example3.factories.AbstractFactory;

public class Example3Demo {

    public static void main(String a[]) {
        Client client = new Client(AbstractFactory.getInstance());
        client.perform("acts as input or search query");
    }
}
