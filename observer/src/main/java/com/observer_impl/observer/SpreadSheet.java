package com.observer_impl.observer;

public class SpreadSheet implements Observer {

    @Override
    public void update() {
        System.out.println("Spread Sheet got updated..");
    }
}
