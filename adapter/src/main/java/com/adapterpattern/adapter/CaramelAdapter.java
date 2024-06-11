package com.adapterpattern.adapter;

import com.adapterpattern.adapter.filters.Caramel;

public class CaramelAdapter implements Filter {
    private final Caramel caramel;

    public CaramelAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}