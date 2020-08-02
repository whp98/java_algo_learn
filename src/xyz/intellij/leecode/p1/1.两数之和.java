/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] array = new int[2];
                    array[0]=i;
                    array[1]=j;
                    return array;
                }
            }
        }
        return null;
    }
}
// @lc code=end

