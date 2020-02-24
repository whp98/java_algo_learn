package xyz.intellij.csp.p2013.p1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //每个元素代表数出现的数量
        int[] numbers = new int[10001];
        Scanner sc = new Scanner(System.in);
        int numberCount = sc.nextInt();
        for (int i=0;i<numberCount;i++){
            numbers[sc.nextInt()]++;
        }
        int max=0,index=0;
        for (int j=0;j<10001;j++){
            if (numbers[j]>max){
                max=numbers[j];
                index=j;
            }
        }

        System.out.println(index);
    }
}
