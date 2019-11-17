package edu.gcccd.csis;
import java.util.*;
public class ApproximatePI {
    public static void main(String[] args) {
        System.out.println(approxPi(100000000));
    }
    public static double approxPi(final double runs) {
        final Random random = new Random(System.currentTimeMillis());
        int pointsInCircle = 0;
        for(double i = 0; i < runs; i++) {

            double x = random.nextDouble();
            double y = random.nextDouble();

            if(Math.pow(x-0, 2) + Math.pow(y-0, 2) <= 1) {
                pointsInCircle++;
            }
        }
        return (pointsInCircle / runs) * 4;
    }
}
