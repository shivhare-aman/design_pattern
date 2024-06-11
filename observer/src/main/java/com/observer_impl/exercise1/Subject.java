package com.observer_impl.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<ObserverInterface> observerList = new ArrayList<>();

    public void addObserver(ObserverInterface observerInterface) {
        observerList.add(observerInterface);
    }

    public void removeObserver(ObserverInterface observerInterface) {
        observerList.remove(observerInterface);
    }

    public void updateObservers() {
        for (var observerInterface : observerList) {
            observerInterface.execute();
        }
    }
}
