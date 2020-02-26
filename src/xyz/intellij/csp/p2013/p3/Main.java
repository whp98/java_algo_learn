package xyz.intellij.csp.p2013.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*读入数据*/
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] list = new int[number];
        for (int t=0;t<number;t++){
            list[t]=sc.nextInt();
        }
        /*最大面积*/
        int maxArea = 0;
        for (int i=0; i<number;i++){
            for (int j=i;j<number;j++){
                int area= getArea(list,i,j);
                if (area>maxArea){
                    maxArea=area;
                }
            }
        }
        /*输出结果*/
        System.out.println(maxArea);
    }
    /*
    找到输入数据中从start到end的最大面积
    算法:
    开始到最后的距离为宽度,
    从开始到最后的最低值为高度,
    相乘就可以得出结果
     */
    public static int getArea(int[] list,int start,int end){
        int hight = list[start];
        int width = end-start+1;
        int temp = list[start];
        for (int i=start+1;i<=end;i++){
            /*
            找到最小值
             */
            temp = list[i];
            if (temp<hight)
                hight=temp;
        }
        return hight*width;
    }
}
