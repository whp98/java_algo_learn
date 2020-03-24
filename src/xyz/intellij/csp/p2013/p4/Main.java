package xyz.intellij.csp.p2013.p4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        /*结果*/
        BigInteger result;
        BigInteger tmp = getNi(number);
        BigInteger tmp2 = getNi(4).multiply(getNi(number-4));
        result = tmp.divide(tmp2);
        result = result.multiply(new BigInteger("3"));
        result = result.mod(new BigInteger("1000000007"));
        System.out.println(result);
    }
    /*获取阶乘*/
    public static BigInteger getNi(int num){
        if (num==0){
            return new BigInteger("1");
        }else if (num==1){
            return new BigInteger("1");
        }else {
            BigInteger a = new BigInteger("1");
            for (int i=2; i<=num; i++){
                a.multiply(new BigInteger(i+""));
            }
            return a;
        }
    }
}
