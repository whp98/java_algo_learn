package xyz.intellij.java.learn.algo.ch1;
/**
 * 编写一个递归的静态方法，计算ln(N!)的值
 *  分解这个问题，发现N!是多个数相乘，而
 *  ln(a*b) = ln(a)*ln(b)
 *  ln(N!) = ln((N-1)！)+ln(N)
 *  .
 *  .
 *  .
 *  ln(N!) = ln(0!)+ ... + ln(N-1) +ln(N)
 *
 * 最后的结果是
 *   ln(N!) = ln(N)+ ln(N-1)+ ln(N-2)+ ... +ln(1)+ln(0!)
 *
 * 这里需要使用math库math.log() 来求取自然对数
 *
 * 经过测试结果符合预期
 *
 */
public class p1120 {
    // 实现算法
    private static double fun_lgN(int N){
        if (N==1||N==0){
            return 0.0;
        }else{
            return Math.log(N)+fun_lgN(N-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fun_lgN(1));
    }
}
