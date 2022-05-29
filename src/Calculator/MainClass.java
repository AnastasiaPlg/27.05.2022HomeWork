package task3;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double a = scanner.nextDouble();
            if (a == 00) {
                break;
            }
            String sign = scanner.next();
            double b = scanner.nextDouble();
            Calculator calculator = new Calculator(a, b, sign);
            double result = calculator.calculate();

            System.out.println(result);
        }
    }
}
