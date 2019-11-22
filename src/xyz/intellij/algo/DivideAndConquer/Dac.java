package xyz.intellij.algo.DivideAndConquer;

import java.util.Arrays;

/**
 *
 *
 */
public class Dac {
    static int count = 0;

    private static final int MAX_LENGTH = 211;
    private static int [] copy = new int[MAX_LENGTH];

    /**
     * 交换两个数组元素的数值
     * @param array 需要处理的数组
     * @param left 交换元素1的下标
     * @param right 交换元素二的下标
     */
    private static void swap(int [] array,int left,int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


    /**
     * 基础排序
     * @param array 数组
     * @param left  数据下标
     * @param right 数据上标
     * */
    private static void sort(int [] array,int left,int right){
        if(array.length == 2){
            if(array[left] > array[right])
                swap(array,left,right);
        }else{
            if(array[left] > array[left+1])
                swap(array,left,left+1);
            if(array[left] > array[right])
                swap(array,left,right);
            if(array[left+1] > array[right])
                swap(array,left+1,right);
        }
        //输出每个分组的排序情况
        System.out.println("分组排序:");
        for(int i = left; i <= right;i++)
            System.out.print(array[i]+" ");

        System.out.println();

    }

    /**
     * 算法实现（递归）
     * @param array 待排序的数组
     * @param left 起始下标
     * @param right 结束
     * */
    private static void mergeSort(int [] array,int left,int right){
        //起始结束一致不排序
        if(right == left)
            return ;

        //排序内容长度
        int len = right - left + 1;

        //递归结束条件，最小小问题解决后返回
        if(len == 2 || len ==3){
            sort(array,left,right);
            return ;
        }


        //将问题变小,将问题分解为n个根号n的问题
        final int SQRT = (int) Math.sqrt(len);//根号n
        final int SIZE = (int) (len)/SQRT;//每一个打大小

        //每个分别进入递归
        for(int i=0 ; i < SQRT ;i++ ){
            //涉及边界特殊处理
            if(i != SQRT - 1)
                mergeSort(array, left+i*SIZE, left+i*SIZE+SIZE-1);
            else
                mergeSort(array, left+i*SIZE,right);
        }
        //归并
        merge(array, left, right);
    }


    /**
     * 将根号n个数组合并起来，加入一个辅助数组
     * @param array 待处理数组
     * @param left 下标
     * @param right 上标
     * */
    private static void merge(int [] array, int left, int right){
        int len = right - left +1;

        final int SQRT = (int) Math.sqrt(len);//根号n
        final int SIZE = (int) (len)/SQRT;//每一个打大小

        //放到二维数组中
        int [] [] a = new int[SQRT][];
        for(int i=0 ; i < SQRT ;i++ ){

            if(i != SQRT - 1)
                a[i] = Arrays.copyOfRange(array, left+i*SIZE, left+i*SIZE+SIZE);
            else
                a[i] = Arrays.copyOfRange(array, left+i*SIZE, right+1);
        }


        int [] index = new int[SQRT];

        //从小到大排列
        for(int j = left;j <= right ;j++){
            int min = Integer.MAX_VALUE;
            int flag = 0;

            //从每一组的低位遍历开始每次找到一个最小值，放到辅助数组里面，index存放遍历的游标
            for(int i=0 ; i < SQRT ;i++ ){
                //确定游标是否已经到了尾部
                if(index[i] == a[i].length)
                    continue;
                //找到最小值
                if(a[i][index[i]] < min){
                    min = a[i][index[i]];
                    flag = i;
                }
            }
            index[flag]++;
            copy[j] = min;
        }
        //排序好的放到数组里面
        for(int k = left ; k <= right ; k++)
            array[k] = copy[k];
    }

    //测试算法
    public static void main(String[] args) {
        int[] aaa = new int[]{403, 647, 188, 192, 853, 551, 900, 965, 210, 718, 677, 332, 68, 785, 26, 149, 579, 986, 864, 528};
        int[] aaa1 = new int[]{444};
        int[] aaa2 = new int[]{8000,4000};
        int[] aaa3 = new int[]{};
        mergeSort(aaa2,0,aaa2.length-1);

        System.out.println("排序后");
        for (int i : aaa2) {
            System.out.print(" "+i);
        }

    }
}
