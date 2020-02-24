package xyz.intellij.csp.p2013.p1;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();
        int countNew = 0;
        Integer tempNumber;
        int max=0;
        for (int i=0;i<numberCount;i++){
            tempNumber = scanner.nextInt();
            countNew = hashMap.get(tempNumber)==null ? 1:hashMap.get(tempNumber)+1;
            if (countNew>max){
                max=countNew;
            }
            hashMap.put(tempNumber,countNew);
        }
        ArrayList<Integer> al = (ArrayList<Integer>) getKeys(hashMap, max);
        Collections.sort(al);
        System.out.println(al.get(0));
    }

    public static Object getKeys(Map map, Object value){
        Set<Object> keySet=map.keySet();
        ArrayList<Object> result = new ArrayList<>();

        for (Object key:keySet){
            if (map.get(key).equals(value)){
                result.add(key);
            }
        }
        return result;
    }
}
