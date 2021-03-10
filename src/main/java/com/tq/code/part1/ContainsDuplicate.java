package com.tq.code.part1;

import java.util.Arrays;

/**
 * @description: 存在重复元素
 * @author: tq
 * @create: 2021-03-08 00:28
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 * https://leetcode-cn.com/problems/contains-duplicate/solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,31,13,2,3,17};
        //int[] arr={2,14,18,22,22};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums){
        if (nums==null) return false;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 超时
     * @param nums
     * @return
     */
//    public static boolean containsDuplicate(int[] nums){
//        if (nums==null) return false;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
