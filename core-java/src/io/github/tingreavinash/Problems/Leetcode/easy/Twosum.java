package io.github.tingreavinash.Problems.Leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Twosum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] res = twoSum2(nums, target);
        //int[] res = twopointer(nums, target);

        System.out.println(Arrays.toString(res));
    }

    /**
     * Two pointer method works only if the array is sorted.
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twopointer(int[] nums, int target) {
        Arrays.sort(nums);
        int[] res = new int[2];

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                return res;
            }

            if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return res;
    }


    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            Integer index = map.get(target - currentNum);
            if (index != null) {
                res[0] = index;
                res[1] = i;
                return res;
            } else {
                map.put(currentNum, i);
            }
        }

        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) continue;
                int num2 = nums[j];
                if (num1 + num2 == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }

        }
        return result;
    }
}
