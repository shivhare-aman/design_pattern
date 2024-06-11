package com.observer_impl.exercise1;

public class StatusBar implements ObserverInterface {

    private final DataSource dataSource;

    public StatusBar(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void execute() {
        System.out.println("Status Bar: Latest price of InnoStock is: " + dataSource.getInnoStock());
    }
}