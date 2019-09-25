package xyz.intellij.java.learn.algo.ch1;

/**
 *  编写一个静态方法 histogram()，接受一个整型数组 a[]
 *  和一个整数M为参数并返回一个大小为M的数组，
 *  其中第i个元素的值为整数i在参数数组中出现的次数。
 *  如果a[]中的值均在0到M-1 之间，返回数组中所有元素之和应该和
 *  a.length 相等。
 *
 *  实现思路：
 *  对于第i个元素来说他的地址为i-1，
 *  对于元素m来说它在返回数组r中的位置是 m-1 即是r[m-1]
 *  但是这里需要避免数据越界问题
 *  不越界条件是 m-1>=0 && m-1<M
 *  那么步骤就是遍历a中的每一个元素，判断是否会越界，如果不会越界那么将r[m-1]加一
 *  还要实现一个计算数据和的算法来验证上面的理论
 *
 */
public class p1115 {
    //测试
    public static void main(String[] args) {
        //用于测试的数组a
        int M = 10;
        int[] a = {6,8,9,4,5,6,3,4,5,2,4,7,5,2,5,2,5,2,5,4};
        //用例分析
        // 6：2
        // 8：1
        // 9：1
        // 4：4
        // 5：6
        // 3：1
        // 7：1
        // 2：4
        // 数目和 20
        int[] m = histogram(a,M);
        System.out.println(sumForIns(m));
        prIns(m);
        if (sumForIns(m)==20){
            System.out.println("yes");
        }
    }
    //实现功能的方法
    private static int[] histogram(int[] a, int M){
        //创建用于返回的数组
        int[] r = new int[M];
        for(int tmp:a){
            //判断是否越界
            if (tmp-1>=0 && tmp-1<M){
                //相应元素数目加一
                r[tmp-1]++;
            }
        }
        return r;
    }
    //简单实现的int型数组求和
    private  static int sumForIns(int[] a){
        int sum=0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }
    //实现结果展示
    private static void prIns(int[] a){
        int l = a.length;
        for (int i=0;i<l;i++){
            System.out.println(i+1+": "+a[i]);
        }
    }
}
