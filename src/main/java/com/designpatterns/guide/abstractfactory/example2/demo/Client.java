package com.designpatterns.guide.abstractfactory.example2.demo;

import com.designpatterns.guide.abstractfactory.example2.displays.Display;
import com.designpatterns.guide.abstractfactory.example2.factories.MobileFactory;
import com.designpatterns.guide.abstractfactory.example2.os.Os;

public class Client {

    private Display display;
    private Os os;

    public Client(MobileFactory mobileFactory) {
        display = mobileFactory.createDisplay();
        os = mobileFactory.createOs();
    }

    public void displayMobile() {
        System.out.println(display.getName());
        System.out.println(os.getName());
        System.out.println(os.getVersion());
    }
}
