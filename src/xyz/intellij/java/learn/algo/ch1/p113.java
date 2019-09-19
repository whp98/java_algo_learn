package xyz.intellij.java.learn.algo.ch1;

public class p113 {
    public static void main(String[] args) {
        // System.out.println(args.length);
        if(args.length==3){
            if(args[1].equals(args[2])&&args[0].equals(args[2])){
                System.out.println("equal");
            }else{
                System.out.println("not equal");
            }
        }else{
            System.out.println("没有参数");
        }
    }
}
