package xyz.intellij.leecode.lcp01;

/**
 * @Classname Main
 * @Description 猜数字
 * @Date 2020/6/17 0:04
 * @Created by whp98
 */
public class Main {
//
//    执行用时 :
//            0 ms
//, 在所有 Java 提交中击败了
//100.00%
//    的用户
//    内存消耗 :
//            36.9 MB
//, 在所有 Java 提交中击败了
//5.88%
//    的用户
    public int game(int[] guess, int[] answer) {
        int res= 0;
        res+=guess[0]==answer[0]?1:0;
        res+=guess[1]==answer[1]?1:0;
        res+=guess[2]==answer[2]?1:0;
        return res;
    }

}
