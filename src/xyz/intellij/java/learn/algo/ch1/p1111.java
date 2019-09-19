package xyz.intellij.java.learn.algo.ch1;

public class p1111 {
    public static void main(String[] args) {
        Boolean[][] bools = new Boolean[5][15];
        //行列遍历
        for (int i = 0; i < bools.length; i++) {
            //列遍历
            for (int j = 0; j < bools[0].length; j++) {
                bools[i][j] = Boolean.TRUE;//逐个赋值
                //创造不一样的情况
                if ((i+1)*(j+1)==8){
                    bools[i][j] = Boolean.FALSE;
                }
            }
        }
//        //打印列号前面的tab
//        System.out.print("\t");
//        for (int j = 0; j < bools[0].length; j++) {
//            //打印列号
//            System.out.print((j+1)+"\t");
//        }
//        System.out.print("\n");
//        for (int i = 0; i < bools.length; i++) {
//            //打印行号
//            System.out.print((i+1)+"\t");
//            for (int j = 0; j < bools[0].length; j++) {
//                //打印
//                char a;
//                if (bools[i][j]){
//                    a = '*';
//                }else{
//                    a = ' ';
//                }
//                System.out.print(a+"\t");
//            }
//            System.out.print("\n");
//        }
        pf(bools);
    }
    //单独封装的 打印 二维布尔数组
    public static void pf(Boolean[][] bools){
        //打印列号前面的tab
        System.out.print("\t");
        for (int j = 0; j < bools[0].length; j++) {
            //打印列号
            System.out.print((j+1)+"\t");
        }
        System.out.print("\n");
        for (int i = 0; i < bools.length; i++) {
            //打印行号
            System.out.print((i+1)+"\t");
            for (int j = 0; j < bools[0].length; j++) {
                //打印
                char a;
                if (bools[i][j]){
                    a = '*';
                }else{
                    a = ' ';
                }
                System.out.print(a+"\t");
            }
            System.out.print("\n");
        }
    }
}
