package xyz.intellij.csp.p201412.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//z字型扫描

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scale = sc.nextInt();
        int[][] array= new int[scale][scale];
        List<Integer> result = new ArrayList<Integer>();

        for(int x=0;x<scale;x++){
            for(int y=0;y<scale;y++){
                array[x][y]=sc.nextInt();
            }
        }

        boolean isDown = false;
        //每一次过滤
        for(int i =0;i<2*scale-1;i++){
            int line1=i;
            List<Integer> temp = new ArrayList<Integer>();
            for(int x=0;x<scale;x++){
                for(int y=0;y<scale;y++){
                    if((x+y)==line1){
                        temp.add(array[x][y]);
                    }
                }
            }
            if(isDown){
                isDown=false;
                for (Integer integer : temp) {
                    result.add(integer);
                }
            }else{
                isDown=true;
                Collections.reverse(temp);
                for (Integer integer : temp){
                    result.add(integer);
                }
            }
        }
        //输出结果
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }
    }
}