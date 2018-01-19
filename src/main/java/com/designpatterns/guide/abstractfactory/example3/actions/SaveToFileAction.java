package com.designpatterns.guide.abstractfactory.example3.actions;

public class SaveToFileAction implements SaveAction {
    @Override
    public String save(String input) {
        return "Data saved to file completed";
    }
}
