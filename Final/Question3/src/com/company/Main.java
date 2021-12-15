package com.company;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {1,1,1};
        int k1 = 2;
        int[] nums2 = {1,2,3};
        int k2 = 3;
        int res1 = subarraysSum(nums1, k1);
        int res2 = subarraysSum(nums2, k2);
        System.out.println(res1);
        System.out.println(res2);

    }
    public static int subarraysSum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
