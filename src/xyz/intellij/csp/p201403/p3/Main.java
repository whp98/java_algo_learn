package xyz.intellij.csp.p201403.p3;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        // 构建两个数组
        char[] chars = str.toCharArray();
        ArrayList<String> noParmeters = new ArrayList<String>();
        ArrayList<String> havaParmeters = new ArrayList<String>();
        Boolean boolFlag = true;
        for(int i = 0;i<chars.length;i++){
            if(chars[i]!=':' && i+1<chars.length){
                if(chars[i+1]==':'){
                    havaParmeters.add("-"+chars[i]);
                }else{
                    noParmeters.add("-"+chars[i]);
                }
            }else{
                if(chars[i]!=':')
                    noParmeters.add("-"+chars[i]);
            }
        }
        // 读入字符串，并处理
        for (int j = 1; j <= num; j++) {
            String cmd = sc.nextLine();
            String[] cmd_strs = cmd.split(" ");
            HashMap<String,String> hashRes = new HashMap<>(); 
            List<String> result = new ArrayList<String>();
            for (int i = 1; i < cmd_strs.length; i++) {
                //注意防止越界
                if(isInit(havaParmeters, cmd_strs[i])&&i<cmd_strs.length-1){
                    hashRes.put(cmd_strs[i],""+cmd_strs[i+1]);
                    i++;

                }else if(isInit(noParmeters, cmd_strs[i])) {
                    
                    hashRes.put(cmd_strs[i],"");
                }else {
                    break;
                }
            }
            for(String key: hashRes.keySet()){
                if(hashRes.get(key).equals("")){
                    result.add(key);
                }else{
                    result.add(key+" "+hashRes.get(key));
                }
            }
            
            //输出结果
            Collections.sort(result);
            System.out.print("Case "+j+":");
            for(String aa:result){
                System.out.print(" ");
                System.out.print(aa);
            }
            System.out.println();
        }
    }
    static boolean isInit(ArrayList<String> strings, String str) {
        for (String str1 : strings) {
            if (str1.equals(str))
                return true;
        }
        return false;
    }
}