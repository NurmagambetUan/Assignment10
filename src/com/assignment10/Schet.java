package com.assignment10;

public class Schet implements IOperations {

    public Schet(){
        System.out.println("Schet uspewno zakryt");
        System.out.println("=========================");
        System.out.println("Uspewno");
    }
    @Override
    public void zakaz(Korzina korzina) {
        System.out.println("Zakroite schet");
    }

    @Override
    public void podtverjdenie(Korzina korzina) {
        System.out.println("Zakaz uje zakryt");
    }

    @Override
    public void schet(Korzina korzina) {
        System.out.println("Schet uspewno zakryt");
    }

    @Override
    public void dostavka(Korzina korzina) {
        System.out.println("Dostavka v processe");
        korzina.setiOperations(new Dostavka());
        for (String product : korzina.getProducts()){
            System.out.println("--"+product);
        }
    }

    @Override
    public void otmena(Korzina korzina) {
        System.out.println("Otmena zakaza");
        korzina.setiOperations(new Otmena());
    }
}
