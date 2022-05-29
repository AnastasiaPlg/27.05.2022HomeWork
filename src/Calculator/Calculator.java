package task3;

public class Calculator implements SimpleOperations, HardOperations {
    double a;
    double b;
    String sign;

    public Calculator(double a, double b, String sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }
    public double calculate() {
        double result = 0;
        if (sign.equals("+") || sign.equals("-")) {
            result = findSum(a, b, sign);
        }
        if (sign.equals("*") || sign.equals("/")) {
            result = findMulti(a, b, sign);
        }
        return result;
    }
    @Override
    public double findSum(double a, double b, String sign) {
        double result = 0;
        if(sign.equals("+")) {
            result = a + b;
        }
        if (sign.equals("-")) {
            result = a + (-1 * b);
        }
        return result;
    }

    @Override
    public double findMulti(double a, double b, String sign) {
        double result = 0;
        if(sign.equals("*")) {
         result = a * b;
        }
        if(sign.equals("/")) {
            result = a * (1 / b);
        }
        return result;
    }
}
