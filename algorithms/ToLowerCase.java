package com.zasranet;

import java.util.Scanner;

public class ToLowerCase {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scanner.nextLine();
        System.out.println(foo(s));
    }

    public static String foo(String str) {
        String res = "";
        for (Character ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                res += (char) (ch + 32);
            } else {
                res += ch;
            }
        }
        return res;
    }
}
