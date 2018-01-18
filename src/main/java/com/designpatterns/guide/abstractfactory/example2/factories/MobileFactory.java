package com.designpatterns.guide.abstractfactory.example2.factories;

import com.designpatterns.guide.abstractfactory.example2.displays.Display;
import com.designpatterns.guide.abstractfactory.example2.displays.Touch;
import com.designpatterns.guide.abstractfactory.example2.os.Android;
import com.designpatterns.guide.abstractfactory.example2.os.Os;

public class MobileFactory {

    public static Display createDisplay() {
        return new Touch();
    }

    public static Os createOs() {
        return new Android();
    }
}
