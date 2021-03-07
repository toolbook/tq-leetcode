package com.tq.code.part1;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int m=3;
        int n=4;
        int[] nums1=new int[m+n];
        for(int i=0;i<nums1.length-n;i++){
            nums1[i]=getRand();
        }

        int[] nums2=new int[n];
        for(int i=0;i<nums2.length;i++){
            nums2[i]=getRand();
        }
        merge(nums1,m,nums2,n);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static int getRand(){
        Random rand =new Random();
        return rand.nextInt(100);
    }
}