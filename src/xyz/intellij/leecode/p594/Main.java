package xyz.intellij.leecode.p594;

import java.util.HashSet;

/**
 * @Classname Main
 * @Description 最长和谐子序列
 * @Date 2020/6/17 13:51
 * @Created by whp98
 */
public class Main {
//    执行用时 :
//            2193 ms
//, 在所有 Java 提交中击败了
//5.02%
//    的用户
//    内存消耗 :
//            41.3 MB
//, 在所有 Java 提交中击败了
//33.33%
//    的用户
    public int findLHS(int[] nums) {
        //暴力求解
        //对每一个数字求解
        int max = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x:nums){
            hashSet.add(x);
        }
        for (int x :nums){
            int min = x-1;
            int mFlag = 0;
            if(hashSet.contains(min)){
                for (int y :nums){
                    if(y==min||y==x){
                        mFlag++;
                    }
                }
            }

            int mx = x+1;
            int mxFlag = 0;
            if(hashSet.contains(mx)){
                for (int y :nums){
                    if(y==mx||y==x){
                        mxFlag++;
                    }
                }
            }

            if (mFlag>max){
                max=mFlag;
            }
            if(mxFlag>max){
                max=mxFlag;
            }
        }
        return max;
    }
}
