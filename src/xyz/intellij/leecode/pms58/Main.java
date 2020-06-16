package xyz.intellij.leecode.pms58;

/**
 * @Classname Main
 * @Description 面试题58左旋转字符串
 * @Date 2020/6/16 23:40
 * @Created by whp98
 */
//
//执行用时 :
//        0 ms
//        , 在所有 Java 提交中击败了
//        100.00%
//        的用户
//        内存消耗 :
//        40.1 MB
//        , 在所有 Java 提交中击败了
//        100.00%
//        的用户
public class Main {
    public String reverseLeftWords(String s, int n) {
        String head = s.substring(0,n);
        String end = s.substring(n,s.length());
        return end+head;
    }
}
