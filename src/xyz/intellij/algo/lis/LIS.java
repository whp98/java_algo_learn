package xyz.intellij.algo.lis;

public class LIS {
    public static int lis(int[] array){
        int length=array.length;
        if (length ==0)
            return 0;
        int maxCount=0;
        int[] dp=new int[length];
        for(int i =0;i<length;i++){
            dp[i]=1;
            for(int j =0;j<i;j++){
                if(array[j]<array[i])
                    dp[i]=dp[i]>dp[j]+1?dp[i]:dp[j]+1;
                if(maxCount<dp[i])
                    maxCount=dp[i];
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] array={-3,1,3,6,-1,2,-3,4,-5,6,-7,7};
        int maxLength=LIS.lis(array);
        System.out.println("maxLength="+maxLength);
    }

}
