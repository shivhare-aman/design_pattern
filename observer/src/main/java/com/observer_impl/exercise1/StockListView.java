package com.observer_impl.exercise1;

public class StockListView implements ObserverInterface {

    private final DataSource dataSource;

    public StockListView(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void execute() {
        System.out.println("StockList View: Latest price of InnoStock is: " + dataSource.getInnoStock());
    }
}
