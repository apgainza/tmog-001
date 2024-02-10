package org.tfoc;

import java.util.HashMap;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        int[] response = new int[]{};
        Map<Integer, Integer> mapNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (mapNums.containsKey(res)) {
                response = new int[]{mapNums.get(res), i};
                break;
            }
            mapNums.put(nums[i], i);
        }
        return response;
    }

    public static int[] twoSumWorse(int[] nums, int target) {
        int[] response = new int[]{};
        for (int i = 0; i < nums.length; i++) {
            boolean isTargetFound = false;
            for (int j = i + 1; j < nums.length; j++) {
                Integer firstParemeter = nums[i];
                Integer secondParameter = nums[j];
                if (target == firstParemeter + secondParameter) {
                    response = new int[]{i, j};
                    isTargetFound = true;
                    break;
                }
            }
            if (isTargetFound)
                break;
        }
        return response;
    }
}
