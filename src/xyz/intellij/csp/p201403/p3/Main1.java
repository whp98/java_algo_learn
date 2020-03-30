package xyz.intellij.csp.p201403.p3;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rule = scanner.next();

        List<String> argsWithout = new ArrayList<>();
        List<String> argsWith = new ArrayList<>();

        for(int i = 0; i < rule.length(); i++){
            if(rule.charAt(i) != ':' && i != rule.length() - 1){
                if(rule.charAt(i + 1) == ':'){
                    argsWith.add("-" + rule.charAt(i));
                }else{
                    argsWithout.add("-" + rule.charAt(i));
                }
            }else{
                if(rule.charAt(i) != ':'){
                    argsWithout.add("-" + rule.charAt(i));
                }
            }
        }

        Integer N = scanner.nextInt();
        scanner.next();

        for(int i = 1; i <= N; i++){
            List<String> result = new ArrayList<>();
            HashMap<String, String> visited = new HashMap<>();
            System.out.print("Case " + i + ": ");
            String command = scanner.nextLine();
            String[] divCom = command.split(" ");
            for(int j = 1; j < divCom.length; j++){
                if(divCom[j].contains("-")){
                    if(j != divCom.length - 1 && argsWith.contains(divCom[j])){
                        visited.put(divCom[j], divCom[j + 1]);
                        j++;
                    }else if(argsWithout.contains(divCom[j])){
                        visited.put(divCom[j], "");
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }
            for(String key : visited.keySet()){
                if(visited.get(key).equals("")){
                    result.add(key);
                }else {
                    result.add(key + " " + visited.get(key));
                }
            }
            Collections.sort(result);
            for(String o : result){
                System.out.print(" " + o);
            }
            System.out.println();
        }
    }
}