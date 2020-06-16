package xyz.intellij.leecode.p1470;

/**
 * @Classname Main
 * @Description 重新排列数组
 * @Date 2020/6/16 23:22
 * @Created by whp98
 */

//执行用时 :
//        0 ms
//        , 在所有 Java 提交中击败了
//        100.00%
//        的用户
//        内存消耗 :
//        40.2 MB
//        , 在所有 Java 提交中击败了
//        100.00%
//        的用户
public class Main {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for(int i=0;i<n;i++){
            res[2*i]=nums[i];
            res[2*i+1]=nums[n+i];
        }
        return res;
    }
}
