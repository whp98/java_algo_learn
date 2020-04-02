package xyz.intellij.csp.p201412.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//直接采用暴力法
public class Main {
    static class Dan{
        Dan(int type,double price,int number){
            this.type=type;
            this.price=price;
            this.number=number;
        }
        //数量 0买1卖
        int type;
        double price;
        int number;
    }
    public static void main(String[] args) {
        HashMap<Double,Integer> hashMapBuy = new HashMap<>();
        HashMap<Double,Integer> hashMapSell = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        List<Double> price_all = new ArrayList<Double>();
        //记住防止撤单
        HashMap<Integer,Dan> dHashMap = new HashMap<>();
        int count = 1;
        while(sc.hasNext()){
            String string = sc.next();
            if(string.equals("-1")){
                break;
            }
            if(string.equals("buy")){
                Dan tmp = new Dan(0, sc.nextDouble(), sc.nextInt());
                dHashMap.put(count, tmp);
                count++;
            }else if(string.equals("sell")){
                Dan tmp = new Dan(1, sc.nextDouble(), sc.nextInt());
                dHashMap.put(count, tmp);
                count++;
            }else if(string.equals("cancel")){
                count++;
                dHashMap.remove(sc.nextInt());
            }
        }
        //放到分别的哈希表中
        for (Dan tmp: dHashMap.values()) {
            if(tmp.type==0){
                hashMapBuy.put(tmp.price, tmp.number);
            }else{
                hashMapSell.put(tmp.price, tmp.number);
            }
        }

        long maxCount=0;
        double price_current = 0;
        //获取最大成交量，暴力法
        //以买入的人为主，遍历
        
        for (Double p0 : hashMapBuy.keySet()){
            //根据算法取得数量buy和sell的数量
            long count_buy=0L;
            long count_sell=0L;
            for(Double price_buy : hashMapBuy.keySet()){
                if(price_buy>=p0){
                    count_buy+=hashMapBuy.get(price_buy);
                }
            }
            for(Double price_sell : hashMapSell.keySet()){
                if(price_sell<=p0){
                    count_sell+=hashMapSell.get(price_sell);
                }
            }
            if(count_buy<count_sell){
                if(count_buy==maxCount && price_current<p0){
                    price_current=p0;
                }
                if(count_buy>maxCount){
                    maxCount=count_buy;
                    price_current=p0;
                }
            }else{
                if(count_sell==maxCount && price_current<p0){
                    price_current=p0;
                }
                if(count_sell>maxCount){
                    maxCount=count_sell;
                    price_current=p0;
                }
            }
        }
        System.out.printf("%.2f %d",price_current,maxCount);
    }
}