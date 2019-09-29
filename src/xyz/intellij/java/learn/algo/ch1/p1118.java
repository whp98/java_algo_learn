package xyz.intellij.java.learn.algo.ch1;

/**
 * 请看以下递归函数：
 * public static int mystery(int a, int b) {
 *      if (b == 0) return 0;
 *      if (b % 2 == 0) return mystery(a+a, b/2);
 *      return mystery(a+a, b/2) + a;
 * }
 * mystery(2, 25) 和 mystery(3, 11) 的返回值是多少？
 * 给定正整数 a 和 b，mystery(a,b) 计算的结果是什么？
 * 将代码中的 + 替换为 * 并将 return 0 改为 return 1，然后回答相同 的问题。
 *
 * 分析：这是一个递归程序
 * 这个方法里面有两个参数，a和b 递归的返回条件是 b==0
 * 每次递归调用条件为b%2==0的时候a都会乘二 最后的返回结果是: 0+历次加上的a值
 * 分析第一个
 * case  3   2   2  3   3   1
 * re    +2  +0 +0 +16 +32
 * a     2   4   8  16  32
 * b     25  12  6  3  1   0
 * 输出 0+32+16+0+0+2=50
 * case 3   3   2  3  2
 * re   +3 +6  +0 +24 0
 * a    3  6  12 24
 * b    11 5  2  1    0
 * 输出 0+24+0+6+3=33
 * 经过上面的思考过程我猜测这个程序的目的是计算两个数相乘的结果
 * 过程中a一直加倍而b却不断除以二，并且判断其中有没有余数，如果有余数会多加上a
 * 那么最后的结果因该是 a*b
 * 如果将返回结果 改为1 并且将运算符 更换为 ‘*’
 * 那么计算结果就是 a^b
 *
 *
 */
public class p1118 {
    public static void main(String[] args) {
        System.out.println(mystery(2,25)==50);
        System.out.println(mystery(3,11)==33);
        System.out.println(mystery(2,100));
        System.out.println(mystery(2,200));
        System.out.println(mystery_new(3,3));
        System.out.println(mystery_new(10,9));

    }
    private static int mystery(int a, int b){
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
    private static int mystery_new(int a, int b){
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery_new(a*a, b/2);
        return mystery_new(a*a, b/2) * a;
    }
}
