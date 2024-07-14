package com.pattern.strategy.strategyPattern;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W Filter..");
    }
}
