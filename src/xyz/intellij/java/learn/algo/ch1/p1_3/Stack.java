package xyz.intellij.java.learn.algo.ch1.p1_3;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

/**
 * @Classname Stack
 * @Description 下压堆栈链表实现
 * @Date 2020/4/12 11:26
 * @Created by whp98
 */
public class Stack<Item> {
    private Node first;
    private int N;
    //节点内部类
    private class Node{
        Item item;
        Node next;
    }
    //如果链表是空的那么第一个后面的是null 或者链表长度是0 也可以写成N==0
    public boolean isEmpty(){ return first==null;}
    public int size(){ return N;}
    /**
     * @Description 向栈顶添加一个元素
     * @param item 元素
     * @return void
     * @date 2020/4/12 11:42
     * @auther whp98
     */
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    /**
     * @Description 从栈顶删除一个元素
     * @param
     * @return Item
     * @date 2020/4/12 11:45
     * @auther whp98
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    /**
     * @Description 测试用例
     * @param
     * @return
     * @date 2020/4/12 11:50
     * @auther whp98
     */
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        //输入部分
        String test = "nihao hahah  大家好 - 你好 woc - - - - - END -";
        BufferedReader bufferedReader = new BufferedReader(new StringReader(test));
        Scanner sc = new Scanner(bufferedReader);
        while(sc.hasNext()){
            String item = sc.next();
            if(item.equals("-") && !s.isEmpty()){
                System.out.println(s.pop());
            }else{
                s.push(item);
            }
        }
    }
}
