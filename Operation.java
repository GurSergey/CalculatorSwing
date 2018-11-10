package com.company;

public enum Operation {
    Plus(0), Minus(1), Divide(2), Multiple(3), Sqrt(4), Power(5) , Empty(6);
    String equivalent;
    Operation(int i) {
        switch (i) {
            case 0:
                equivalent = " + ";
                break;
            case 4:
                equivalent = " sqrt ";
                break;
            case 1:
                equivalent = " - ";
                break;
            case 5:
                equivalent = " ^ ";
                break;
            case 2:
                equivalent = " / ";
                break;
            case 3:
                equivalent = " * ";
                break;
        }
    }

    public static double makeOperation(double operand1, double operand2, Operation operation)
    {

        double result = 0;
        switch (operation) {
            case Plus:
                result = operand1+operand2;
                break;
            case Sqrt:
                result = Math.sqrt(operand1);
                break;
            case Minus:
                result = operand2-operand1;
                break;
            case Power:
                result = Math.pow( operand2, operand1);
                break;
            case Divide:
                result = operand2/operand1;
                break;
            case Multiple:
                result = operand1*operand2;
                break;
        }
        return result;
    }
}
