package com.designpatterns.guide.abstractfactory.example3.factories;

import com.designpatterns.guide.abstractfactory.example3.actions.*;

public class FileActionsFactory extends AbstractFactory {
    @Override
    public ReadAction createReadAction() {
        return new ReadFromFileAction();
    }

    @Override
    public SaveAction createSaveAction() {
        return new SaveToFileAction();
    }
}
