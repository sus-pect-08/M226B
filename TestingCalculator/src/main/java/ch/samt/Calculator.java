package ch.samt;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }
    public  int divide(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("Divide by zero");
        }else {
            return a / b;
        }
    }
}
