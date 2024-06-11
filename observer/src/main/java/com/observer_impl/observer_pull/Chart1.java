package com.observer_impl.observer_pull;

// The below is the example of pull style of Observer.

// In this we couple the DataSource class with the Chart and use the methods directly to fetch the values.

// The main advantage is that we can get the values of all the fields of DataSource class which was not
// a case with push style.

public class Chart1 implements Observer1 {

    private final DataSource dataSource;

    public Chart1(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated with the value: " + dataSource.getValue());
    }
}
