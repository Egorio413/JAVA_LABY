package edu.course.lab01;

public class TextTasks {

    public static void reverse(String[] args) {
        String input = String.join(" ", args);
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        System.out.println(result.toString());
    }

    public static void palindrome(String[] args) {
        String input = String.join(" ", args);
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}