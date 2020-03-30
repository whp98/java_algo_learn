package xyz.intellij.csp.p201403.p2;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 面向对象模拟
 */
public class Main{
    static class Window{
        int x1,y1,x2,y2;
        int num;
        Window(int x1,int y1,int x2, int y2,int num){
                this.x1=x1;
                this.x2=x2;
                this.y1=y1;
                this.y2=y2;
                this.num=num;
        }

        boolean isInWindow(int x,int y){
            if (x<=x2 && x>=x1 && y>=y1 && y<=y2){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public String toString() {
            return ""+num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Window> arrayList = new ArrayList<Window>();
        for(int i=0;i<m;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            arrayList.add(new Window(x1, y1, x2, y2,i+1));
        }
        
        int x,y;
        for(int i=0;i<n;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            boolean flag=true;
            for(int j = m-1;j>=0;j--){
                if(arrayList.get(j).isInWindow(x, y)){
                    Window a=arrayList.remove(j);
                    arrayList.add(a);
                    System.out.println(a);
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("IGNORED");
        }
    }
}