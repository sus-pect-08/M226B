package ch.samt;

public class CalculatorService {
         Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int addAndMultiplyByTwo(int a, int b) {
            return  calculator.addition(a, b) * 2;
        }
}
