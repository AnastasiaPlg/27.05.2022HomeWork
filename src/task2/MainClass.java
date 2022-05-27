package task2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        System.out.println("Enter SI in format: C or Celsius, K or Kelvin, F or Faringate:");
        String si1 = scanner.next();
        String si2 = scanner.next();
        BaseConverter baseConverter = new BaseConverter(t, si1, si2);
        System.out.println(String.format("%.2f " + si2, baseConverter.convert()));
        ;
    }
}
