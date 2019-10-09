package xyz.intellij.java.learn.algo.ch1;

/**
 *  在计算机上运行以下程序：
 * public class Fibonacci {
 *  public static long F(int N){
 *      if (N == 0) return 0;
 *      if (N == 1) return 1;
 *      return F(N-1) + F(N-2);
 *  }
 *  public static void main(String[] args){
 *      for (int N = 0; N < 100; N++)
 *      StdOut.println(N + " " + F(N));
 *  }
 * }
 * 计算机用这段程序在一个小时之内能够得到 F(N) 结果的最大 N 值是多少？
 * 开发 F(N) 的一 个更好的实现，用数组保存已经计算过的值。
 *
 * 运行一次后发现计算到 48 左右已经很慢了
 * 那么我们就使用费数组创建一个100个容量的数组来计算一下试一下
 *
 *
 */
public class p1119 {
    //目测是用来计算费波纳希数列的
    private static int num=100;
    private static long new_F(int no){
        //直接计算100的数值
        long[] a;
        a = new long[num];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2;i<num;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[no];
    }
    //经过测试发现计算速度很快
    public static long F(int N){
       if (N == 0) return 0;
       if (N == 1) return 1;
       return F(N-1) + F(N-2);
   }
   public static void main(String[] args){
        p1119 tt = new p1119();
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + tt.new_F(N));
   }
}
