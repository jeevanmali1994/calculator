package com.calculator.calculator.ds;

import org.springframework.lang.NonNull;

public class OperationData {
    long operandOne,operandTwo;
    String operator;

    public long getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(long operandOne) {
        this.operandOne = operandOne;
    }

    public long getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(long operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
