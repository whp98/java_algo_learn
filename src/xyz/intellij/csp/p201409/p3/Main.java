package xyz.intellij.csp.p201409.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//匹配字符串

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strTarget = sc.next();
        int flag = sc.nextInt();
        int num = sc.nextInt();
        List<String> result = new ArrayList<String>();
        for(int i=0;i<num;i++){
            String strCurrent = sc.next();
            String string = strCurrent;
            if ((flag==1 && strCurrent.contains(strTarget)) || (flag==0&&strCurrent.toUpperCase().contains(strTarget.toUpperCase())) ){
                result.add(string);
            }
        }

        for(String cur:result){
            System.out.println(cur);
        }
    }
}