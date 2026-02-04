package com.gla.arrays;

public class LC1480 {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] nums1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums1[i]=sum;
        }
        return nums1;
    }
}
