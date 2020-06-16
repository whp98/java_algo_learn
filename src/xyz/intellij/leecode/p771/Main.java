package xyz.intellij.leecode.p771;

/**
 * @Classname Main
 * @Description 宝石和石头
 * @Date 2020/6/17 0:55
 * @Created by whp98
 */
public class Main {
    //    执行用时 :
//            1 ms
//, 在所有 Java 提交中击败了
//99.51%
//    的用户
//    内存消耗 :
//            37.9 MB
//, 在所有 Java 提交中击败了
//9.09%
//    的用户

//    public int numJewelsInStones(String J, String S) {
////        直接暴力
//        int sum = 0;
//
//        char[] chars = J.toCharArray();
//        char[] chars1 = S.toCharArray();
//        for (char i : chars) {
//            for (char j : chars1) {
//                if (i == j) sum++;
//            }
//        }
//        return sum;
//    }
//
//    public int numJewelsInStones(String J, String S) {
//        byte[] bow = new byte[58];
//        int count = 0;
//        for (char ch : J.toCharArray()) {
//            bow[ch - 65] = 1;
//        }                          //宝石标志置1
//        for (char ch : S.toCharArray()) {
//            if (bow[ch - 65] == 1) {
//                count++;
//            }                      //在石头中找到宝石计时器count加1
//        }
//
//        return count;
//    }
//
//
//    public int numJewelsInStones(String J, String S) {
//        Set<Character> Jset = new HashSet();
//        for (char j : J.toCharArray())
//            Jset.add(j);
//
//        int ans = 0;
//        for (char s : S.toCharArray())
//            if (Jset.contains(s))
//                ans++;
//        return ans;
//    }


}
