package com.assignment10;

import java.util.ArrayList;
import java.util.List;

public class Korzina {
    private List<String> products;
    IOperations iOperations;

    public Korzina(IOperations iOperations){
        this.iOperations = iOperations;
        this.products = new ArrayList<>();
    }

    public void setiOperations(IOperations iOperations) {
        this.iOperations = iOperations;
    }

    public List<String> getProducts() {
        return products;
    }

    void addToKorzina(String productName){
        this.products.add(productName);
    }

    public void zakaz(){
        this.iOperations.zakaz(this);
    };
    public void podtverjdenie(){
        this.iOperations.podtverjdenie(this);
    };
    public void schet(){
        this.iOperations.schet(this);
    };
    public void dostavka(){
        this.iOperations.dostavka(this);
    };
    public void otmena(){
        this.iOperations.otmena(this);
    };

}
