package xyz.intellij.leecode.p1281;

/**
 * @Classname Main
 * @Description 整数的各位积和之差
 * @Date 2020/6/17 0:44
 * @Created by whp98
 */
public class Main {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mx = 1;
        while (n != 0) {
            sum += n % 10;
            mx *= n % 10;
            n /= 10;
        }
        return mx - sum;
    }
}
