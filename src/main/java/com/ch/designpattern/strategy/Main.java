package com.ch.designpattern.strategy;

import com.ch.designpattern.strategy.Calculator.DoType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setStrategy(DoType.ADD);
        log.info("result:{} ",cal.execute(1, 5));

    }
}
