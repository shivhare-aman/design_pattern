package com.observer_impl.observer_push;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject2 {
    private final List<Observer2> observerList = new ArrayList<>();

    public void addObserver(Observer2 observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer2 observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(int value) {
        for (var observer: observerList) {
            observer.update(value);
        }
    }
}
