package com.assignment10;

public class Podtverjdenie implements IOperations {

    public Podtverjdenie(){
        System.out.println("Zakaz podtverjden");
        System.out.println("======================");
        System.out.println("podtverjden");
    }

    @Override
    public void zakaz(Korzina korzina) {
        korzina.setiOperations(new Zakaz());
    }

    @Override
    public void podtverjdenie(Korzina korzina) {
        System.out.println("Zakaz podtverjden");
    }

    @Override
    public void schet(Korzina korzina) {
        System.out.println("Obwaia summa");
        korzina.setiOperations(new Schet());
    }

    @Override
    public void dostavka(Korzina korzina) {
        System.out.println("Zakaz Dostavlen");
    }

    @Override
    public void otmena(Korzina korzina) {
        System.out.println("Otmena zakaza");
        korzina.setiOperations(new Otmena());
    }
}
