package com.designpatterns.guide.abstractfactory.example3.actions;

public class SaveToCloud implements SaveAction {

    @Override
    public String save(String input) {
        return "Data saved on cloud completed";
    }
}
