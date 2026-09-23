package edu.course.lab01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String command = args[0];
        String[] rest = Arrays.copyOfRange(args, 1, args.length);

        switch (command) {
            case "fizzbuzz":
                if (rest.length != 0) {
                    printUsage();
                    return;
                }
                FizzBuzz.main(rest);
                break;
            case "reverse":
                if (rest.length < 1) {
                    printUsage();
                    return;
                }
                TextTasks.reverse(rest);
                break;
            case "quadratic":
                if (rest.length != 3) {
                    printUsage();
                    return;
                }
                QuadraticEquation.solve(rest);
                break;
            case "series":
                if (rest.length != 0) {
                    printUsage();
                    return;
                }
                Series.calculate();
                break;
            case "palindrome":
                if (rest.length < 1) {
                    printUsage();
                    return;
                }
                TextTasks.palindrome(rest);
                break;
            default:
                printUsage();
        }
    }

    private static void printUsage() {
        System.out.println("Использование:");
        System.out.println("  fizzbuzz");
        System.out.println("  reverse <строка>");
        System.out.println("  quadratic <a> <b> <c>");
        System.out.println("  series");
        System.out.println("  palindrome <строка>");
    }
}