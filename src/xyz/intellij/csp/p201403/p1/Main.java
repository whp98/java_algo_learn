package xyz.intellij.csp.p201403.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            a.add(sc.nextInt());
        }

        //找到相反数
        int result=0;

        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                if(a.get(i)==(-a.get(j)))
                    result++;
            }
        }
        System.out.println(result);
    }
}