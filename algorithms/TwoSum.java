package com.zasranet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] myArr = {2, 3, 4, 7, 8};
        int[] res = twoSum(myArr, 9);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(target - nums[i])) {
                return new int[]{i, myMap.get(target - nums[i])};
            } else {
                myMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}
