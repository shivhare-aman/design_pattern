package com.observer_impl.observer_push;

public class SpreadSheet2 implements Observer2 {

    @Override
    public void update(int value) {
        System.out.println("Spread Sheet got updated with the value : " + value);
    }
}
