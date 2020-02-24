package xyz.intellij.csp.p2013.p1;
/*尝试使用hash map解决*/
import java.util.*;

public class Main0 {
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
        ArrayList<Integer> al = (ArrayList<Integer>) getKeys(hashMap,max);
        Collections.sort(al);
        System.out.println(al.get(0));
    }

    public static Object getKeys(Map map,Object value){
        ArrayList<Object> res=new ArrayList<>();
        Set<Map.Entry<Object,Object>> mapSet = map.entrySet();
        Iterator<Map.Entry<Object,Object>> iterator = mapSet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Object,Object> objectObjectEntry = iterator.next();
            if (objectObjectEntry.getValue().equals(value)){
                res.add(objectObjectEntry.getKey());
            }
        }
        return res;
    }
}
