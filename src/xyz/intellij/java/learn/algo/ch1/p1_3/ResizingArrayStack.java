package xyz.intellij.java.learn.algo.ch1.p1_3;

import java.util.Iterator;
import java.util.SortedMap;

/**
 * @Classname ResizingArrayStack
 * @Description 下压栈LIFO，能够动态调整数组大小的实现
 * @Date 2020/4/10 22:47
 * @Created by whp98
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a;
    private int N ;
    public boolean isEmpty(){return N==0;}
    public int size() {return N;}

    public ResizingArrayStack() {
        a = (Item[]) new Object[2];
        N = 0;
    }

    private void resize(int max){
        //将数组移动到一个大小为max的新数组
        Item[] temp = (Item[]) new Object[max];
        for (int i=0;i<N;i++)
            temp[i] = a[i];
        a = temp;
    }
    /**
     * @Description 压入新元素
     * @param item 元素
     * @return void
     * @date 2020/4/10 23:15
     * @auther whp98
     */
    public void  push(Item item){
        //将元素添加到栈顶
        if(N==a.length) resize(2*a.length);
        a[N++] = item;
    }

    /**
     * @Description 删除元素
     * @return Item
     * @date 2020/4/10 23:15
     * @auther whp98
     */
    public Item pop(){
        //从栈顶删除元素
        Item item = a[--N];
        //这里避免对象游离
        a[N] = null;
        if(N>0 && N==a.length/4) resize(a.length/2);
        return item;
    }
    /**
     * @Description 返回迭代器
     * @return java.util.Iterator<Item>
     * @date 2020/4/10 23:14
     * @auther whp98
     */
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }


    //内部类实现迭代功能
    private class ReverseArrayIterator implements Iterator<Item>{
        //支持后进先出的迭代
        private int i = N;
        @Override
        public boolean hasNext(){ return i>0;}
        @Override
        public Item next(){return a[--i];}
        public void remove(){ throw new UnsupportedOperationException();}
    }
    /**
     * @Description 测试代码
     * @param args
     * @return void
     * @date 2020/4/10 23:19
     * @auther whp98
     */
    public static void main(String[] args) {
        ResizingArrayStack<String> resizingArrayStack = new ResizingArrayStack<>();

        resizingArrayStack.push("sss");

        resizingArrayStack.push("aaa");
        System.out.println(resizingArrayStack.size());
        System.out.println(resizingArrayStack.pop());
        System.out.println(resizingArrayStack.size());
        System.out.println(resizingArrayStack.pop());
    }
}
