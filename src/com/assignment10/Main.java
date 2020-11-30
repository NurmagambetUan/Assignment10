package com.assignment10;

public class Main {

    public static void main(String[] args) {

        IOperations iOperations = new Zakaz();
        Korzina korzina = new Korzina(iOperations);
        korzina.zakaz();
        korzina.podtverjdenie();
        korzina.schet();
        korzina.dostavka();
        korzina.otmena();
    }
}
