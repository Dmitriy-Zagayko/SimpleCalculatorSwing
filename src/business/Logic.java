package business;

import constant.Constants;

public class Logic {

    public double summing(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num1 == 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_NUMBER);
        } else if (num2 == 0) {
            throw new IllegalArgumentException(Constants.INCORRECT_NUMBER);
        }
        return num1 / num2;
    }
}
