# java_algo_learn
本项目是用来学习《算法》人民邮电 2012 这本书的，内容基本上是书里面的代码
，为了以后可以使用这些代码，每个文件的commit上加了该文件代码的用途，就是为了保证复用性


## `下压栈`能够动态调整数组的大小 数组实现

[ResizingArrayStack](src/xyz/intellij/java/learn/algo/ch1/p1_3/ResizingArrayStack.java)

使用泛型和迭代实现

## `下压堆栈` 链表实现

[Stack](src/xyz/intellij/java/learn/algo/ch1/p1_3/Stack.java)

每当插入一个元素的时候，就在链表头部插入，如果删除就从链表头部删除

## 先进先出队列实现

[Queue](src/xyz/intellij/java/learn/algo/ch1/p1_3/Queue.java)

使用一个单向链表保存数据，从链表后面插入数据，从前面取出数据，使用数字来表示当前数组长度