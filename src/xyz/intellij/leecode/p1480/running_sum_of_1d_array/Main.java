package xyz.intellij.leecode.p1480.running_sum_of_1d_array;

/**
 * @Classname Main
 * @Description leetcode 一维数组动态求和
 * @Date 2020/6/16 22:47
 * @Created by whp98
 */
public class Main {
//    显示详情
//    执行用时 :
//            6 ms
//, 在所有 Java 提交中击败了
//100.00%
//    的用户
//    内存消耗 :
//            39.9 MB
//, 在所有 Java 提交中击败了
//100.00%
//    的用户
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result =new int[length];
        for(int i =0;i<length;i++){
            for(int j = 0;j<=i;j++){
                result[i]+=nums[j];
            }
        }
        return result;
    }

}
