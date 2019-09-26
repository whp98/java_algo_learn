package xyz.intellij.java.learn.algo.ch1;

/**
 * 给出 exR1(6) 的返回值：
 * public static String exR1(int n) {
 *  if (n <= 0) return "";
 *  return exR1(n-3) + n + exR1(n-2) + n;
 * }
 * 分析：
 * 这是一个递归算法，返回条件1是当n小于或等于0返回值为空字符串
 * 返回条件2是 exR1(n-3)加上n(字符串拼接)加上exR1(n-2)+n(字符串拼接)
 * 一： 返回 exR1(3)+6+exR1(4)+6
 * 二： exR1(3)返回 ""+3+exR1(1)+3 -> "3113" 得出 exR1(1)="11" exR1(3)="3113"
 * 三： exR2(4)返回 exR1(1)+4+exR1(2)+4 -> "114224" 得出 exR1(4)="114224" exR2="22"
 * 四：结果是 "311361142246"
 *   下面是验证过程
 *
 */
public class p1116 {
    public static void main(String[] args) {
        //直接将结果和输出结果用字符串比较对比
        System.out.println(exR1(6).equals("311361142246"));
    }
    private static String exR1(int n) {
     if (n <= 0) return "";
     return exR1(n-3) + n + exR1(n-2) + n;
    }
}
