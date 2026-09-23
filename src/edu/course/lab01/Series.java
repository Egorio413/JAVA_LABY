package edu.course.lab01;

public class Series {
    public static void calculate() {
        double sum = 0.0;
        int n = 2;
        int count = 0;

        while (true) {
            double denominator = (double) n * n + n - 2;
            double term = 1.0 / denominator;
            if (Math.abs(term) < 1e-6) break;
            sum += term;
            count++;
            n++;
        }

        System.out.println(sum);
        System.out.println(n - 1);
        System.out.println(count);
    }
}