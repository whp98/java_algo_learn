package xyz.intellij.java.learn.algo.ch1;

/**
 * 1.1.17 找出以下递归函数的问题：
 * public static String exR2(int n) {
 *  String s = exR2(n-3) + n + exR2(n-2) + n;
 *  if (n <= 0) return "";
 *  return s;
 * }
 * 答：这段代码中的基础情况永远不会被访问。
 * 调用 exR2(3) 会产生调用 exR2(0)、exR2(-3) 和 exR2(-6)，
 * 循环往复直到发生 StackOverflowError。
 *  运行结果： Exception in thread "main" java.lang.StackOverflowError ...
 * 分析错误产生的原因：
 *  由于每次都不会运行到“return s”那么程序会一直运行下去，字符串长度会越来越长
 *  执行main函数会创建一个线程，同时创建一个虚拟机栈（栈内存）每次调用新方法会执行新的压栈操作
 *  就会连续产生新的栈帧区块，当栈帧区块超过系统配置的栈内存就会出现 java.lang.StackOverflowError
 *
 */
public class p1117 {
    public static void main(String[] args) {
        exR2(3);
    }
    public static String exR2(int n) {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }

}
