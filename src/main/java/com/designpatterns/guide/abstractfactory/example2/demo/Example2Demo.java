package com.designpatterns.guide.abstractfactory.example2.demo;

import com.designpatterns.guide.abstractfactory.example2.factories.MobileFactory;

public class Example2Demo {

    public static void main(String a[]) {
        Client client = new Client(new MobileFactory());
        client.displayMobile();
    }
}
