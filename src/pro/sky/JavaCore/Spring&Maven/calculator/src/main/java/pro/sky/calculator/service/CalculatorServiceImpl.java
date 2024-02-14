package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.dao.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    @Override
    public String minus(int num1, int num2) {
        int dif = num1 - num2;
        return num1 + " - " + num2 + " = " + dif;
    }

    @Override
    public String multiply(int num1, int num2) {
        int prod = num1 * num2;
        return num1 + " * " + num2 + " = " + prod;
    }

    @Override
    public String divide(int num1, int num2) {
            int quot = num1 / num2;
            return num1 + " / " + num2 + " = " + quot;
        }
}
