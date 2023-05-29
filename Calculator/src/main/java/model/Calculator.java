package model;

public class Calculator {
    public static float calculator(float fistNumber, float secondNumber, char operator) {
        switch (operator){
            case '+':
                return fistNumber + secondNumber;
            case '-':
                return fistNumber - secondNumber;
            case '*':
                return fistNumber * secondNumber;
            case '/':
                if(secondNumber != 0)
                    return fistNumber / secondNumber;
                else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
