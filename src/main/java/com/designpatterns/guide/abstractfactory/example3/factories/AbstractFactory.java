package com.designpatterns.guide.abstractfactory.example3.factories;

import com.designpatterns.guide.abstractfactory.example3.actions.ReadAction;
import com.designpatterns.guide.abstractfactory.example3.actions.SaveAction;

public abstract class AbstractFactory {

    public abstract ReadAction createReadAction();
    public abstract SaveAction createSaveAction();

    private static AbstractFactory factory;

    public static final AbstractFactory getInstance() {

        if (factory == null) {
            //factory = new CloudActionsFactory();
            factory = new FileActionsFactory();
        }
        return  factory;
    }
}
