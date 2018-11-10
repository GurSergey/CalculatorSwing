package com.company;

import sun.invoke.empty.Empty;

import java.lang.reflect.Array;
import java.util.*;

public class Model {

    double prevNum = 0;

    String currentNumString = "0";
    Operation currentOperation = Operation.Empty;
    boolean pointIsInput = false;
    String errorMessage = "";
    boolean errorIsSet = false;

    private void inputNumber(int num)
    {
        if(currentNumString=="0")
        {
            currentNumString="";
        }
        currentNumString += num;
    }

    private void makePrevOperation()
    {
        pointIsInput = false;
        if(!checkProblems()){
            reset();
        }
        else
        {
            if (currentOperation != Operation.Empty) {
                currentNumString = fmt(Operation.makeOperation(Double.parseDouble(currentNumString), prevNum, currentOperation));
                prevNum = Double.parseDouble(currentNumString);
                currentNumString = "0";

            } else {
                prevNum = Double.parseDouble(currentNumString);
                currentNumString = "0";
            }
        }
    }

    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

    public boolean checkPoint()
    {
        if(currentNumString.contains("."))
            return true;
        else
            return false;
    }

    public boolean checkProblems()
    {
        if((Double.parseDouble(currentNumString)<0)&&(currentOperation==Operation.Sqrt))
        {
            errorIsSet = true;
            errorMessage = "Корень отрицательного числа";
            return false;
        }
        if((currentOperation == Operation.Divide)&&(Double.parseDouble(currentNumString)==0)) {
            errorIsSet = true;
            errorMessage = "Деление на ноль числа !";
            return false;
        }

        return true;
    }

    public void reset()
    {
        prevNum = 0;
        currentNumString = "0";
        currentOperation = Operation.Empty;
        pointIsInput = false;

    }

    public void inputCommand(Command command)
    {
        errorMessage = "";
        errorIsSet = false;
        switch (command)
        {
            case One:
                inputNumber(1);
                break;
            case Two:
                inputNumber(2);
                break;
            case Three:
                inputNumber(3);
                break;
            case Four:
                inputNumber(4);
                break;
            case Five:
                inputNumber(5);
                break;
            case Six:
                inputNumber(6);
                break;
            case Seven:
                inputNumber(7);
                break;
            case Eight:
                inputNumber(8);
                break;
            case Nine:
                inputNumber(9);
                break;
            case Zero:
                inputNumber(0);
                break;
            case Back:
                if(currentNumString.charAt(currentNumString.length()-1)=='.')
                    pointIsInput = false;
                currentNumString=currentNumString.substring(0,currentNumString.length()-1);
                if(currentNumString.isEmpty())
                    currentNumString = "0";
                break;
            case Calc:
                if(currentOperation!= Operation.Empty)
                {
                    if(!checkProblems()){
                        reset();
                    }
                    else
                    {
                        currentNumString = fmt(Operation.makeOperation(Double.parseDouble(currentNumString), prevNum, currentOperation));
                        currentOperation = Operation.Empty;
                        prevNum = 0;
                        pointIsInput = checkPoint();
                    }

                }
                break;
            case Plus:
                makePrevOperation();
                currentOperation = Operation.Plus;
                break;
            case Sqrt:
                if(currentOperation != Operation.Empty) {
                    if(!checkProblems()) {
                        reset();
                        break;
                    }
                    else {
                        currentNumString = fmt(Operation.makeOperation(Double.parseDouble(currentNumString), prevNum, currentOperation));
                        prevNum = 0;
                    }
                }
                currentOperation = Operation.Sqrt;
                if(!checkProblems()){
                    reset();
                }
                else {
                    currentNumString = fmt(Operation.makeOperation(Double.parseDouble(currentNumString), 0, Operation.Sqrt));
                    pointIsInput = checkPoint();
                    currentOperation = Operation.Empty;
                }

                break;
            case Minus:
                makePrevOperation();
                currentOperation = Operation.Minus;
                break;
            case Point:
                if(!pointIsInput)
                    currentNumString+=".";
                pointIsInput = true;
                break;
            case Power:
                makePrevOperation();
                currentOperation = Operation.Power;
                break;
            case Divide:
                makePrevOperation();
                currentOperation = Operation.Divide;
                break;
            case Multiply:
                makePrevOperation();
                currentOperation = Operation.Multiple;
                break;
        }
    }


}
