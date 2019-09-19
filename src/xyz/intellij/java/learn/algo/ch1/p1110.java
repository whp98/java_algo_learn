package xyz.intellij.java.learn.algo.ch1;

public class p1110 {
    public static void main(String[] args) {
//        int[] a
//        Error:(7, 13) java: 可能尚未初始化变量a
//        替换代码
        int[] a = new int[10];
        for(int i=0; i<10 ;i++)
            a[i] = i*i;
        for (int b:
            a) {
            System.out.println(b);
        }
    }
}
