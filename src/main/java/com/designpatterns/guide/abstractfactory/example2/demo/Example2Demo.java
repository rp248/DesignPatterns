package com.designpatterns.guide.abstractfactory.example2.demo;

import com.designpatterns.guide.abstractfactory.example2.factories.MobileFactory;

/**
 * For simple applications that do not need to create families of objects
  but want to separate and centralize object creation.

 Os and Display two different type of objects(related to different families)
 */
public class Example2Demo {

    public static void main(String a[]) {
        Client client = new Client(new MobileFactory());
        client.displayMobile();
    }
}
