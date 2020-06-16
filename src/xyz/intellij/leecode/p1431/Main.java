package xyz.intellij.leecode.p1431;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname Main
 * @Description 拥有糖果最多的孩子
 * @Date 2020/6/16 23:04
 * @Created by whp98
 */
//执行用时 :
//        1 ms
//        , 在所有 Java 提交中击败了
//        99.92%
//        的用户
//        内存消耗 :
//        39.8 MB
//        , 在所有 Java 提交中击败了
//        100.00%
//        的用户
public class Main {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> booleanList = new LinkedList<>();
        for(int x:candies){
            if (x>max){
                max=x;
            }
        }
        for(int y:candies){
            if(y+extraCandies>=max){
                booleanList.add(true);
            }else {
                booleanList.add(false);
            }
        }
        return booleanList;
    }
}
