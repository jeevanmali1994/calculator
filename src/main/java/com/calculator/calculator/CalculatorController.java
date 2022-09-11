package com.calculator.calculator;

import com.calculator.calculator.SimpleCalculator.Operations;
import com.calculator.calculator.ds.OperationData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    public Operations operations =  new Operations();
    @GetMapping("/")
    public String test() {
        return "Done";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestBody OperationData operationData) {
        switch (operationData.getOperator()) {
            case "+": return operations.addition(operationData.getOperandOne(), operationData.getOperandTwo()) + "";
            default: return "wrong input";
        }
    }
}
