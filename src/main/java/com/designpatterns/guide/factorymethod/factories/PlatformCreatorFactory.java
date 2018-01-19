package com.designpatterns.guide.factorymethod.factories;

import com.designpatterns.guide.factorymethod.Platforms.PlatformType;
import com.designpatterns.guide.factorymethod.creator.AndroidPlatformCreator;
import com.designpatterns.guide.factorymethod.creator.PlatformCreator;

public class PlatformCreatorFactory {

    public static PlatformCreator getPlatformCreator(PlatformType platformType) {
        return null;
    }
}
