package HomeWork_7;

import HomeWork_7.controller.CalculatorController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorController calculatorController = new CalculatorController();
        do {
            calculatorController.initCalculator();
            calculatorController.getResult();
            System.out.println("""
                Желаете повторить?
                1 - да
                2 - нет
                """);
        }
        while (!new Scanner(System.in).next().equals("2"));
    }
}

