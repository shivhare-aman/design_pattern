package com.observer_impl.observer_pull;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject1 {
    private final List<Observer1> observerList = new ArrayList<>();

    public void addObserver(Observer1 observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer1 observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (var observer: observerList) {
            observer.update();
        }
    }
}
