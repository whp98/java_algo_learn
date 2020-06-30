package xyz.intellij.leecode.p1370;

/**
 * @Classname Main
 * @Description 上升下降字符串
 * @Date 2020/6/30 23:16
 * @Created by whp98
 */


/**
 * 执行结果：
 * 通过
 * 显示详情
 * 执行用时：
 * 4 ms
 * , 在所有 Java 提交中击败了
 * 58.12%
 * 的用户
 * 内存消耗：
 * 40 MB
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 */
public class Main {
    public static void main(String[] args) {

    }
    public String sortString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = s.length();
        int[] count = new int[26];
        for (char character:s.toCharArray()){
            count[character-'a']++;
        }
        while(len>0){
            //步骤一：从小到大
            for (int i=0;i<26;i++){
                if(count[i]>0){
                    count[i]--;
                    len--;
                    stringBuilder.append((char) ('a' +i));
                }
            }
            for (int i=25;i>=0;i--){
                if(count[i]>0){
                    count[i]--;
                    len--;
                    stringBuilder.append((char) ('a' +i));
                }
            }
        }
        return stringBuilder.toString();
    }
}
