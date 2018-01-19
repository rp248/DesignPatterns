package com.designpatterns.guide.factorymethod.creator;

import com.designpatterns.guide.factorymethod.Platforms.AndroidPlatform;
import com.designpatterns.guide.factorymethod.Platforms.Platform;

public class AndroidPlatformCreator extends PlatformCreator{
    @Override
    public Platform createPlatform() {
        return new AndroidPlatform();
    }
}
