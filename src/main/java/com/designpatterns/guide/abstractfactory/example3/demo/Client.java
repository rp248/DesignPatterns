package com.designpatterns.guide.abstractfactory.example3.demo;

import com.designpatterns.guide.abstractfactory.example3.actions.ReadAction;
import com.designpatterns.guide.abstractfactory.example3.actions.SaveAction;
import com.designpatterns.guide.abstractfactory.example3.factories.AbstractFactory;

public class Client {
    private SaveAction saveAction;
    private ReadAction readAction;

    public Client(AbstractFactory abstractFactory) {
        saveAction = abstractFactory.createSaveAction();
        readAction = abstractFactory.createReadAction();
    }

    public void perform(String input){
        System.out.println(saveAction.save(input));
        System.out.println(readAction.read(input));
    }
}
