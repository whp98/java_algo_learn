package xyz.intellij.java.learn.algo.ch1;
//编写一个静态方法lg()，接受一个整型参数N，返回不大于log2N的最大整数。不要使用Math库

/**
 * 这里可以这样思考
 * log2(1)=0 返回 0
 * log2(2)=1 返回 1
 * log2(3)=1.? 返回1
 * log2(4)=2 返回 2
 *  只要将2来连乘取到刚好小于或等于N的值再找到2
 * 连乘的次数就是我们想要的结果
 */
public class p1114 {
    //测试
    public static void main(String[] args) {
        int n = -5;
        while (n<30){
            System.out.print("n="+n+"   lg="+lg(n)+"  lg1="+lg1(n)+"\n");
            n++;
        }
    }
    //实现功能
    private static int lg(int N){
        int g = 2; //适用于通用情况，当将g改为底数就可以求解其他情况
        int n; //用来获取结果
        int a = 1;//用来存储连乘结果

        if (N<0){
            n = -1;
        //这里使用了一个判断，可以直接排除一些情况，其实代码可以缩减一下
        }else if (N<g){
            n = 0;
        }else{
            for (int i=0;;i++){
                if (a>=N){
                    n = i;
                    break;
                }
                a = a*g;
            }
        }
        return n;
    }
    //缩减
    private static int lg1(int N){
        int g = 2; //适用于通用情况，当将g改为底数就可以求解其他情况
        int n; //用来获取结果
        int a = 1;//用来存储连乘结果

        if (N<0){
            n = -1;
        }else{
            for (int i=0;;i++){
                if (a>=N){
                    n = i;
                    break;
                }
                a = a*g;
            }
        }
        return n;
    }
}
