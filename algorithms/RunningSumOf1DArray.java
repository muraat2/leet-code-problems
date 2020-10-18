package com.company;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                res[j] = sum;
            }
        }
        return res;
    }
}
