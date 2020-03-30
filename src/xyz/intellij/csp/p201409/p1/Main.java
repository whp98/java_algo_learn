package xyz.intellij.csp.p201409.p1;

import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int[] a = new int[num];
        int res=0;
        int count=0;
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }

        for(int i = 0;i<num;i++){
            for(int j=i+1;j<num;j++){
                res=Math.abs(a[i]-a[j]);
                if(res==1)
                    count++;
            }
        }
        System.out.println(count);
    }
}