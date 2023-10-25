package HomeWork_7.controller;

import HomeWork_7.service.CalculatorService;
import HomeWork_7.view.CalculatorView;

public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();
    CalculatorView calculatorView = new CalculatorView();

    public void initCalculator(){
        calculatorService.initCalculator();
        calculatorView.printOnConsole(String.format("Параметры калькулятора: %s, %s",
                calculatorService.getNumber1(),calculatorService.getNumber2()));
        startCalculating();
    }

    public void startCalculating(){
        calculatorService.start();
    }

    public void getResult(){
        calculatorView.printOnConsole(String.format("Результатом операции является %s",calculatorService.getResult()));
        System.out.println(calculatorService.getResult());
    }
}
