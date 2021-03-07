package com.tq.code.part1;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @description: 删除排序数组中的重复项
 * @author: tq
 * @create: 2021-03-07 10:28
 *
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-xiang-by-/
 *
 **/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums=new int[]{1,1,2};
        int[] nums2=new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println("length="+removeDuplicates(nums2));
        System.out.println("length="+removeDuplicates2(nums2));
    }

    /**
     * 方法1：
     * @param nums
     * @return
     */
    public static  int removeDuplicates(int[] nums) {
        Set set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            boolean flag=false;
            int temp=0;
            for(int j=i+1;j<nums.length;j++){
                if(!flag && (nums[j]==nums[i] ||nums[j]<=nums[i])){
                    flag=true;
                    temp=j;//temp位置的数需要改动
                }
                if(flag && (nums[j]>nums[i])){
                    nums[temp]=nums[j];
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
        return set.size();
    }
    /**
     * 方法2：双指针
     */
    public static  int removeDuplicates2(int[] nums) {
        if(nums.length==0) return 0;
        int i=0,j=1;
        while (j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return i+1;
    }
}
