package xyz.intellij.leecode.p1342;

/**
 * @Classname Main
 * @Description 将数字变成0的次数
 * @Date 2020/6/17 0:38
 * @Created by whp98
 */
public class Main {
    public int numberOfSteps(int num) {
        int res = 0;
        while (num != 0) {
            res++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
        }
        return res;
    }
}
