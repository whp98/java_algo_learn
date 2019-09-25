package xyz.intellij.java.learn.algo.ch1;

public class p1113 {
    //编写算法用来打印一个M行N列的转置
    public static void main(String[] args) {
        int[][] ma = {{1,2,3,4},{7,8,9,6}};
        prMa(ma);
        prMa(transForintMax(ma));
    }
    //用于打印二维数组
    private static void prMa(int[][] ma){
        //打印列号前面的tab
        System.out.print("\t");
        for (int j = 0; j < ma[0].length; j++) {
            //打印列号
            System.out.print((j+1)+"\t");
        }
        System.out.print("\n\n");
        for (int i = 0; i < ma.length; i++) {
            //打印行号
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < ma[0].length; j++) {
                //打印每个单位
                int a;
                a = ma[i][j];
                System.out.print(a + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n"); //将两次打印分开
    }
    //用于二维数组转置的方法
    private static int[][] transForintMax(int[][] ma){
        int m = ma.length;
        int n = ma[0].length;
        //创建转置用临时数组
        int[][] Nma = new int[n][m];
        //开始转置
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                Nma[j][i]=ma[i][j];
            }
        }
        return Nma;
    }
}
