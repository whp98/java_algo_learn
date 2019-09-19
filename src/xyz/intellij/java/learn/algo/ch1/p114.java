package xyz.intellij.java.learn.algo.ch1;

public class p114 {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
//        if (a>b) then c= 0;
//        Error:(6, 23) java: 此处不允许使用变量声明

//        if a>b {c=0;}
//        Error:(8, 11) java: 需要'('
//        Error:(8, 15) java: 需要')'
        if(a>b) c = 0;
//        if (a>b) c = 0 else b = 0;
//        Error:(13, 23) java: 需要';'
    }
}
