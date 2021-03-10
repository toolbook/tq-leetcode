package com.tq.code.part1;

import java.util.Arrays;

/**
 * @description: 旋转数组
 * @author: tq
 * @create: 2021-03-09 23:16
 * <p>
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
 * <p>
 *  
 * <p>
 * 进阶：
 * <p>
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 2 * 104
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 * <p>
 * 作者：力扣 (LeetCode)
 * https://leetcode-cn.com/problems/rotate-array/solution/
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/
public class RotateArray {
    public static void main(String[] args) {
//        输入: nums = [1,2,3,4,5,6,7], k = 3
//        输出: [5,6,7,1,2,3,4]
        //int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums={1,2};
        int k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int[] nums2 = nums.clone();
        for (int i = 0; i < nums2.length; i++) {
            nums[(i+k)%nums.length] = nums2[i];
        }
//        if (nums.length > 1) {
//            int[] nums2 = nums.clone();
//            for (int i = 0; i < nums2.length; i++) {
//                if (nums.length <= k) {
//                    int n = Math.abs(k - (i + nums.length));
//                    nums[n] = nums2[i];
//                } else {
//                    if ((i + k) < nums.length) {
//                        nums[i + k] = nums2[i];
//                    } else {
//                        nums[i + k - nums.length] = nums2[i];
//                    }
//                }
//            }
//        }
        System.out.println(Arrays.toString(nums));
    }
}
