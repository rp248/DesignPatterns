package com.designpatterns.guide.factorymethod.creator;

import com.designpatterns.guide.factorymethod.Platforms.IOSPlatform;
import com.designpatterns.guide.factorymethod.Platforms.Platform;

public class IOSPlatformCreator extends PlatformCreator{
    @Override
    public Platform createPlatform() {
        return new IOSPlatform();
    }
}
