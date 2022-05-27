package task1;

import java.util.Random;

public class Vector extends CoordinateSystem implements Operations {

    public Vector(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    @Override
    public String toString() {
        return String.format("Vector with coordinates (%.2f, %.2f, %.2f)", getX(), getY(), getZ());
    }

    @Override
    public double findLength() {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return length;
    }

    public Vector findVectorSum(Vector vector) {
        Vector sumVector = new Vector(getX() + vector.getX(), getY() + vector.getY(), getZ() + vector.getZ());
        return sumVector;

    }

    public Vector findVectorDifference(Vector vector) {
        Vector diffVector = new Vector(getX() - vector.getX(), getY() - vector.getY(), getZ() - vector.getZ());
        return diffVector;
    }

    public double findScalarMulti(Vector vector) {
        double scalarMulti = getX() * vector.getX() + getY() * vector.getY() + getZ() * vector.getZ();
        return scalarMulti;
    }

    public double findAngleInRad(Vector vector) {
        double scalarMulti1 = findScalarMulti(vector);
        double length1 = findLength();
        double length2 = vector.findLength();
        double angle = Math.acos(scalarMulti1 / (length1 * length2));
        return angle;
    }

    public double findVectorMulti(Vector vector) {
        double length1 = findLength();
        double length2 = vector.findLength();
        double sinAngle = Math.sin(findAngleInRad(vector));
        double vectorMulti = length1 * length2 * sinAngle;
        return vectorMulti;
    }

    public static Vector[] createArrayOfVectors(int n) {
        Vector[] randomVectors = new Vector[5];
        while (true) {
            double x = 20 * Math.random();
            double y = 20 * Math.random();
            double z = 20 * Math.random();
            if ((Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)) - n) < 0.000001) {
                Vector vector = new Vector(x, y, z);
                for (int i = 0; i < randomVectors.length; i++) {
                    if (randomVectors[i] == null) {
                        randomVectors[i] = vector;
                        break;
                    }
                }
            }
            int q = 0;
            for (int i = 0; i < randomVectors.length; i++) {
                if (randomVectors[i] == null) {
                    q++;
                }
            }
            if (q == 0) {
                break;
            }
        }
        return randomVectors;
    }
}