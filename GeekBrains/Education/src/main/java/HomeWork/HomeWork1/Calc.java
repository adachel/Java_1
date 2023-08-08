package HomeWork.HomeWork1;

import java.util.Scanner;

class Calcul{
    private double Plus(double a, double b){
        double res = 0;
        res = a + b;
        return res;
    }

    private double Minus(double a, double b){
        double res = 0;
        res = a - b;
        return res;
    }
    private double Mumn(double a, double b){
        double res = 0;
        res = a * b;
        return res;
    }

    private double Divide(double a, double b){
        double res = 0;
        if (b != 0){
            res = a / b;
        }
        else res = Double.parseDouble("На '0' делить нельзя!");
        return res;
    }

    public double Calculate(char op, double a, double b) {
        double res = 0;
        switch (op) {
            case '+':
                return Plus(a, b);
            case '-':
                return Minus(a, b);
            case '*':
                return Mumn(a, b);
            case '/':
                return Divide(a, b);
            default:
                throw new ArithmeticException("Не корректный оператор: " + op);
        }
    }


}
public class Calc {
    private static char Op(String op){
        char symbol = op.charAt(0);
        switch (symbol) {
            case '+': return '+';
            case '-': return '-';
            case '*': return '*';
            case '/': return '/';
            default: throw new ArithmeticException("Не корректный оператор: " + op);
        }
    }

    private static double AB(String x){
        double res = Double.parseDouble(x);
        return res;
    }
    public static void main(String[] args) {
        try (Scanner calculator = new Scanner(System.in)) {
            while (true) {
    //            String input = calculator.nextLine();
                double result = 0;
                System.out.println("Введите первое число: ");
                Double a = AB(calculator.nextLine());

                System.out.println("Введите знак действия: ");
                char op = Op(calculator.nextLine());

                System.out.println("Введите второе число: ");
                Double b = AB(calculator.nextLine());

                Calcul calcul = new Calcul();
                result = calcul.Calculate(op, a, b);

                System.out.println("Результат: " + result);
            }
        }
    }
}
