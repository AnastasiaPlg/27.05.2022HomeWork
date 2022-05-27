package task1;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(9, 7, 6);
        System.out.println(String.format("%.2f\n%.2f", vector1.findLength(), vector2.findLength()));
        System.out.println(String.format("%.2f", vector1.findScalarMulti(vector2)));
        System.out.println(String.format("%.2f", vector1.findAngleInRad(vector2)));
        System.out.println(String.format("%.2f", vector1.findVectorMulti(vector2)));
        System.out.println(vector1.findVectorSum(vector2).toString());
        System.out.println(vector1.findVectorDifference(vector2).toString());
        System.out.println(Arrays.toString(Vector.createArrayOfVectors(10)));
    }
}
