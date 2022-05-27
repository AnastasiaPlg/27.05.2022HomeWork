package task2;

public class BaseConverter implements Converter {
    private double t;
    private String si1;
    private String si2;

    public BaseConverter(double t, String si1, String si2) {
        this.t = t;
        this.si1 = si1;
        this.si2 = si2;
    }

    @Override
    public double convert() {
        double result = 0;
        if (si1.equals("C") || si1.equalsIgnoreCase("celsius")) {
            if (si2.equals("K") || si2.equalsIgnoreCase("kelvin")) {
                result = t + 273.15;
            }
            if (si2.equals("F") || si2.equalsIgnoreCase("faringate")) {
                result = (t * (9 / 5)) + 32;
            }
        } else if (si1.equals("K") || si1.equalsIgnoreCase("kelvin")) {
            if (si2.equals("C") || si2.equalsIgnoreCase("celsius")) {
                result = t - 273.15;
            }
            if (si2.equals("F") || si2.equalsIgnoreCase("faringate")) {
                result = (t - 273.15) * (9 / 5) + 32;
            }
        } else if (si1.equals("F") || si1.equalsIgnoreCase("faringate")) {
            if (si2.equals("C") || si2.equalsIgnoreCase("celsius")) {
                result = (t - 32) * (5 / 9);
            }
            if (si2.equals("K") || si2.equalsIgnoreCase("kelvin")) {
                result = (t - 32) * (5 / 9) + 273.15;
            }
        } else {
            System.out.println("Enter correct SI");
            result = -99999999;
        }
        return result;
    }
}
