package com.pattern.strategy.strategyPattern;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG.");
    }
}
