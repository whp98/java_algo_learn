package xyz.intellij.java.learn.algo.ch1;

public class p1112 {
    public static void main(String[] args) {
        //估计代码的输出结果
        //0-9
        int[] a = new int[10];
        for (int i = 0; i < 10;i++)
            a[i] = 9-i;
        for (int i = 0; i < 10;i++)
            a[i] = a[a[i]];
        for (int i = 0; i<10 ;i++)
            System.out.println(i);
        //输出结果符合预期
    }
}
