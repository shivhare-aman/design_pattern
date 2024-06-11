package com.observer_impl.observer_push;

public class Chart2 implements Observer2 {

    @Override
    public void update(int value) {
        System.out.println("Chart got updated with the value : " + value);
    }
}
