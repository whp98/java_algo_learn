package xyz.intellij.java.learn.algo.ch1.p1_3;

/**
 * @Classname Queue
 * @Description 先进先出队列
 * @Date 2020/4/12 12:01
 * @Created by whp98
 */
public class Queue<Item> {
    //指向最早添加的结点队列
    private Node first;
    //指向最后添加的结点队列
    private Node last;
    private int N;
    //节点的内部类
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){ return first == null;}
    //大小
    public int size(){return N;}
    //进入队列
    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }
    //出队列
    public Item dequeue(){
        Item item = first.item;
        first = first.next;

        if(isEmpty()) last = null;
        N--;
        return item;
    }
}
