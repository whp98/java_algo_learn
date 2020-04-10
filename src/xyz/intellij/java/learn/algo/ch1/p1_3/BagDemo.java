package xyz.intellij.java.learn.algo.ch1.p1_3;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BagDemo {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        while(!StdIn.isEmpty() && StdIn.hasNextChar())
            numbers.add(StdIn.readDouble());

        int N = numbers.size();

        double sum = 0.0;
        for (double x: numbers)
            sum+=x;
        double mean = sum/N;

        sum = 0.0;

        for(double x: numbers)
            sum += (x-mean)*(x-mean);
        double std = Math.sqrt(sum/(N-1));

        StdOut.printf("Mean:%.2f\n",mean);

        StdOut.printf("Std dev:%.2f\n",std);

    }
}