package com.zasranet;

import java.util.Scanner;

public class PalindromeNumber {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int initial = x;
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }
        return initial == reversed;
    }
}
