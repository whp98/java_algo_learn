package xyz.intellij.csp.p201503.p3;

import java.util.Scanner;

public class Main1 {
    static int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int week = input.nextInt();
        int day = input.nextInt();
        int startY = input.nextInt();
        int endY = input.nextInt();

        for (int i = startY; i <= endY; i++) {
            //求1850/1/1-某年某月的總天數
            int totalDays = 0;
            for (int j = 1850; j < i; j++) {
                totalDays += 365;
                if (isLeapYear(j))
                    totalDays++;
            }

            //加這年的過完了的月
            for (int j = 0; j < month - 1; j++) {
                totalDays += months[j];
                if (j == 1 && isLeapYear(i))
                    totalDays++;
            }

            //在要求的這個月裡面一天天的遍歷，是對應的星期幾，count就加加，直到等於week
            int n = isLeapYear(i) && month - 1 == 1 ?
                    months[month - 1] + 1 : months[month - 1];
            int count = 0;
            for (int j = 0; j < n; j++) {
                totalDays++;
                if (getWeekOfDay(totalDays) == day)
                    count++;

                if (count == week) {
                    System.out.println(i + "/" + fillSingle(month) +
                            "/" + fillSingle(j + 1));
                    break;
                }
            }

            if (count < week)
                System.out.println("none");
        }
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    //給定從1850/1/1開始到某個日期的天數，
    // 求這個日期是星期幾,1-7代表星期一到日。
    // 1850/1/1的tatalDays=1，
    // 求出來剛剛好是2，星期二
    static int getWeekOfDay(int n) {
        return n % 7 + 1;
    }

    static String fillSingle(int num) {
        if (num < 10)
            return "0" + num;
        return num + "";
    }
}