package com.calculator.calculator.SimpleCalculator;

import org.springframework.stereotype.Service;

@Service
public class Operations {

    public long addition(long number1, long number2) {
        return number1 + number2;
    }
}
