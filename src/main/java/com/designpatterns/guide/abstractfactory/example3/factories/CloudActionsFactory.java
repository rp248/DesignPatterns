package com.designpatterns.guide.abstractfactory.example3.factories;

import com.designpatterns.guide.abstractfactory.example3.actions.*;

public class CloudActionsFactory extends AbstractFactory {
    @Override
    public ReadAction createReadAction() {
        return new ReadFromCloud();
    }

    @Override
    public SaveAction createSaveAction() {
        return new SaveToCloud();
    }
}
