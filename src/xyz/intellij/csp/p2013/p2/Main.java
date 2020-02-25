package xyz.intellij.csp.p2013.p2;

import java.util.ArrayList;
import java.util.Scanner;
/*代码已经通过测试*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*只需要一次读入*/
        String string = sc.nextLine();
        char[] charArray = string.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<Character>();
        /*按照套路操作字符串*/
        for (char letter:charArray){
            if (letter!='-'){
                arrayList.add(letter);
            }
        }
        int sum =0;
        for (int i=0;i<9;i++){
            sum+=(i+1)*Character.getNumericValue(arrayList.get(i));
        }

        if (sum%11 ==
                (arrayList.get(9)=='X' ? 10 : Character.getNumericValue(arrayList.get(9)))){
            System.out.println("Right");
        }else{
            arrayList.remove(9);
            if (sum%11!=10){
                arrayList.add((char)(sum%11+'0'));
            }else{
                arrayList.add('X');
            }
            arrayList.add(1,'-');
            arrayList.add(5,'-');
            arrayList.add(11,'-');
            StringBuilder stringBuilder = new StringBuilder(arrayList.size());
            for (char a:arrayList){
                stringBuilder.append(a);
            }
            System.out.println(stringBuilder.toString());
        }


    }
}
