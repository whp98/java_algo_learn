package xyz.intellij.java.learn.algo.ch1.p1_3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Classname Evaluate
 * @Description 迪杰斯特拉 双栈算术表达式求值算法
 * @Date 2020/4/10 21:39
 * @Created by whp98
 */
public class Evaluate {
    public static void main(String[] args) {
        //测试用例，直接利用Reader输入
        BufferedReader input = new BufferedReader(
                new StringReader("( ( 2 + 3 ) * 4 )"));

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner sc = new Scanner(input);
        while(sc.hasNext()){
            String s = sc.next();
            System.out.println(s);
            if (s.equals("E"))
                break;
            if(s.equals("(")) ;
            else if(s.equals("+")) ops.push(s);
            else if(s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if(s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")){
                //如果字符是‘）’弹出运算符和操作数，计算结果压入栈
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v=vals.pop()+v;
                else if(op.equals("-")) v=vals.pop()-v;
                else if(op.equals("*")) v=vals.pop()*v;
                else if(op.equals("/")) v=vals.pop()/v;
                else if (op.equals("sqrt")) v=Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
