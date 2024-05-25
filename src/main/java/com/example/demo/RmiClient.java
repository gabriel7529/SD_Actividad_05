package com.example.demo;

import java.rmi.Naming;

public class RmiClient {
    public static void main(String[] args) {
        try {
            CalculatorService calculatorService = (CalculatorService) Naming.lookup("rmi://localhost/CalculatorService");
            System.out.println("Add: " + calculatorService.add(2, 3));
            System.out.println("Subtract: " + calculatorService.subtract(5, 2));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
