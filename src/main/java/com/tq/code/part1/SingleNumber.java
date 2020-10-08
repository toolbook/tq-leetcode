package com.tq.code.part1;

/**
 * 只出现一次的数字
 * @author tq
 * @create 2020-10-08-14:44
 */
public class SingleNumber {
    /**
     * 我的解法
     */
    public static int singleNumber(int[] nums) {
        int temp=0;
        int num=-1;
        for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
               if(nums[i]==nums[j]){
                   temp++;
                   num=nums[i];
               }
           }
           if(temp==1){
               return  num;
           }
           temp=0;
        }
        return num;
    }

    /**
     * 异或运算
     * 二进制运算，相同为零，不同为一
     * 0101^0101=0000
     * 0101^0101^1101=1101
     *
     * 一个数和 0 做 XOR 运算等于本身：a⊕0 = a
     * 一个数和其本身做 XOR 运算等于 0：a⊕a = 0
     * XOR 运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
     *
     */
    public static int singleNumber2(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            nums[0] = nums[0]^nums[i+1];
        }
        return nums[0];
    }

    public static void main(String[] args) {

        //int[] nums={2,2,1};
        //int[] nums={4,1,2,1,2};
        int[] nums={5,7,7,2,2,8,3,3,5,1,1};
        int num = singleNumber2(nums);
        System.out.println(num);
    }
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     * 示例 1:
     * 输入: [2,2,1]
     * 输出: 1
     * 示例2:
     * 输入: [4,1,2,1,2]
     * 输出: 4
     *
     * ------------------
     * Given a non-empty  array of integers nums, every element appears twice except for one. Find that single one.
     * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
     * Example 1:
     * Input: nums = [2,2,1]
     * Output: 1
     * Example 2:
     *
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     * Example 3:
     *
     * Input: nums = [1]
     * Output: 1
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/single-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
}
