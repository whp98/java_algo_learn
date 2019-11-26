package xyz.intellij.java.learn.algo.ch1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 * 然后用 printf() 打印一张表格，
 * 每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果，
 * 精确到小数点后三位。
 * 可以用这种程序将棒球球手的击球命中率或者学生的考试分数 制成表格。
 *
 *  输入格式
 *  小明 45 66
 *
 *  输出格式
 *  小明 45 66 0.659
 */
public class p1121 {
    public static void main(String[] args) {
        ArrayList<Line> Lines = new ArrayList<Line>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            Line a = new Line();
            a.setName(scanner.next());
            a.setValue1(scanner.nextInt());
            a.setValue2(scanner.nextInt());
            Lines.add(a);
        }
        System.out.println(Lines.get(0).toString());

    }
}

class Line{
    String name;
    int value1;
    int value2;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return ""+name+" "+value1+" "+value2+" "+(value1/(double)value2);
    }
}
