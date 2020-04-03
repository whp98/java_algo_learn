package xyz.intellij.csp.p201503.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> hashMap = new HashMap<>();
        int n = sc.nextInt();
        int tmp;
        for(int i =0;i<n;i++){
            tmp = sc.nextInt();
            if(hashMap.get(tmp)==null){
                hashMap.put(tmp, 1);
            }else{
                hashMap.put(tmp, hashMap.get(tmp)+1);
            }
        }
        sc.close();

        //排序
        Set<Map.Entry<Integer,Integer>> entry = hashMap.entrySet();
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                //从大到小
                return o2.getValue() - o1.getValue();
            }
        });

        //输出结果
        for (Map.Entry<Integer,Integer> entry2 : list) {
            System.out.println(entry2.getKey()+" "+entry2.getValue());
        }
    }
}