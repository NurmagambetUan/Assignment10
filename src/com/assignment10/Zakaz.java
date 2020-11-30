package com.assignment10;

import java.util.Scanner;

public class Zakaz implements IOperations {

    public Zakaz(){
    }

    @Override
    public void zakaz(Korzina korzina) {
        korzina.setiOperations(new Zakaz());
        Scanner sc = new Scanner(System.in);
        System.out.print("Vyberite product");
        String newProduct = sc.nextLine();
        korzina.addToKorzina(newProduct);
        System.out.println("Product: "+newProduct+" dobavlen v korzinu");
        System.out.println("products: ");
        for (String product: korzina.getProducts()) {
            System.out.println("-"+product);
        }
        System.out.println("Novyi zakaz");
    }

    @Override
    public void podtverjdenie(Korzina korzina) {
        System.out.println("podtverjdenie ");
        korzina.setiOperations(new Podtverjdenie());
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
        System.out.println("Otmena zakaza");
        korzina.setiOperations(new Otmena());
    }
}
