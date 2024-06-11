package com.observer_impl.exercise1;

public class DataSource extends Subject {

    public int innoStock;
    public int venaIndStock;

    public int getVenaIndStock() {
        return venaIndStock;
    }

    public int getInnoStock() {
        return innoStock;
    }

    public void setVenaIndStock(int venaIndStock) {
        this.venaIndStock = venaIndStock;
        updateObservers();
    }

    public void setInnoStock(int value) {
        this.innoStock = value;
        updateObservers();
    }

}
