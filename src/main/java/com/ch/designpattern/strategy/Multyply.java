package com.ch.designpattern.strategy;

public class Multyply implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        return a * b;
    }
}
