package xyz.intellij.leecode.p1108;

/**
 * @Classname Main
 * @Description ip地址无效化
 * @Date 2020/6/17 1:17
 * @Created by whp98
 */
public class Main {
//    执行用时 :
//            0 ms
//, 在所有 Java 提交中击败了
//100.00%
//    的用户
//    内存消耗 :
//            37.5 MB
//, 在所有 Java 提交中击败了
//13.04%
//    的用户
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
