package com.assignment10;

public class Otmena implements IOperations {
    public Otmena(){
        System.out.println("Zakaz uspewno otmenen");
        System.out.println("=========================");
        System.out.println("otmenen");
    }
    @Override
    public void zakaz(Korzina korzina) {
        System.out.println("Zakaz otmenen");
    }

    @Override
    public void podtverjdenie(Korzina korzina) {
        System.out.println("Net zakaza");
    }

    @Override
    public void schet(Korzina korzina) {
        System.out.println("Net zakaza");
    }

    @Override
    public void dostavka(Korzina korzina) {
        System.out.println("Net zakaza");
    }

    @Override
    public void otmena(Korzina korzina) {
        System.out.println("Net zakaza");
    }
}
