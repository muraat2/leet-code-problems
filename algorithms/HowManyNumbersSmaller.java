package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HowManyNumbersSmaller {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbers(nums)));
    }

    public static int[] smallerNumbers(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
