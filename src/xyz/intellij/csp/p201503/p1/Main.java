package xyz.intellij.csp.p201503.p1;

import java.util.Scanner;
//100分
//nextint会导致内存超限
//换行会占用一个nextLine()
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] old = new int[n][m];
        for(int x=0;x<n;x++){
            String s = sc.nextLine();
            String[] temp = s.split(" ");
            for(int y=0;y<m;y++){
                old[x][y]=Integer.parseInt(temp[y]);
            }
        }
        sc.close();
        for(int y=m-1;y>=0;y--){
            for(int x=0;x<n;x++){
                System.out.print(old[x][y]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}