package xyz.intellij.csp.p201409.p2;

import java.util.Scanner;

//直接使用暴力方法
public class Main {
    int[][] array;
    Main(){
        array = new int[100][100];
    }
    public static void main(String[] args) {
        Main main1 = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int x1,y1,x2,y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            main1.add(x1,y1,x2,y2);
        }
        System.out.println(main1.count());
    }

    void add(int x1,int y1,int x2,int y2){
        for(int x=0;x<100;x++){
            for(int y=0;y<100;y++){
                if((x>=x1&&x<x2)&&(y>=y1&&y<y2)){
                    array[x][y]=1;
                }
            }
        }
    }

    int count(){
        int count=0;
        for(int x=0;x<100;x++){
            for(int y=0;y<100;y++){
                count+=array[x][y];
            }
        }
        return count;
    }
}