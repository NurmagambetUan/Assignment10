package com.assignment10;

public class Dostavka implements IOperations {

    public Dostavka(){
        System.out.println("Zakaz uspewno dostavlen");
        System.out.println("=============================");
        System.out.println("Dostavlen");
    }
    @Override
    public void zakaz(Korzina korzina) {
        System.out.println("Zakaz uje dostavlen");
    }

    @Override
    public void podtverjdenie(Korzina korzina) {
        System.out.println("Zakaz ne vybran");
    }

    @Override
    public void schet(Korzina korzina) {
        System.out.println("nichego ne zakazano");
    }

    @Override
    public void dostavka(Korzina korzina) {
        System.out.println("Zakaz uje dostavlen");
    }

    @Override
    public void otmena(Korzina korzina) {
        System.out.println("Zakaz uje dostavlen!!! Nevozmojno otkazat");
    }
}
