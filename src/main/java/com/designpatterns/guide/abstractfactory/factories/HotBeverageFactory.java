package com.designpatterns.guide.abstractfactory.factories;

public interface HotBeverageFactory extends ProductFactory{
    void createCoffee();
    void createTea();
}
