package com.observer_impl.observer;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {
    private final List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (var observer: observerList) {
            observer.update();
        }
    }
}
