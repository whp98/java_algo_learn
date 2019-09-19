package xyz.intellij.java.learn.algo.ch1;

public class p119 {
    public static void main(String[] args) {
        int N = 1555;
        //use java inner method
        System.out.println(Integer.toBinaryString(N));
        //use simple method
        String s="";
        for(int i = N;i > 0; i /= 2)
        {
            s = (i%2)+s;
        }
        System.out.println(s);
        System.out.println(System.getProperty("sun.jnu.encoding"));
    }
}
