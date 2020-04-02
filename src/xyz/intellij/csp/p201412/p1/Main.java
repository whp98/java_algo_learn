package xyz.intellij.csp.p201412.p1;
//门禁系统

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> users = new ArrayList<Integer>();
        int[] count = new int[10000];
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<num;i++){
            int id = sc.nextInt();
            users.add(id);
            result.add(++count[id]);
        }

        //输出结果
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }
    }
}