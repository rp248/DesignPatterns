package com.designpatterns.guide.factorymethod.creator;

import com.designpatterns.guide.factorymethod.Platforms.Platform;

public abstract class PlatformCreator {
    public abstract Platform createPlatform();
}
