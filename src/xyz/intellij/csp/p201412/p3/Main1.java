package xyz.intellij.csp.p201412.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Bill{
    public float price;
    public int count;
    public int index;

    public Bill(float price, int count, int index) {
        this.price = price;
        this.count = count;
        this.index = index;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("-1"))
                break;
            lines.add(line);
        }
        scanner.close();

        boolean[] isCancel = new boolean[lines.size()];
        List<Bill> buyBill = new ArrayList<>();
        List<Bill> sellBill = new ArrayList<>();
        List<Float> prices = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.startsWith("cancel")) {
                int index = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
                isCancel[index - 1] = true;
                prices.add(-1f);
            } else {
                String[] content = line.split(" ");
                String type = content[0];
                float price = Float.parseFloat(content[1]);
                int count = Integer.parseInt(content[2]);
                if(type.equals("buy")){
                    buyBill.add(new Bill(price, count, i));
                } else{
                    sellBill.add(new Bill(price, count, i));
                }
                prices.add(price);
            }
        }

        long dealCount = 0;
        float dealPrice = 0;

        for(int i = 0; i < prices.size(); i++){
            float price = prices.get(i);
            if(price == -1 || isCancel[i])
                continue;
            long buyCount = 0;
            long sellCount = 0;
            for(Bill bill : buyBill){
                if(isCancel[bill.index])
                    continue;
                if(bill.price >= price){
                    buyCount+=bill.count;
                }
            }
            for(Bill bill : sellBill){
                if(isCancel[bill.index])
                    continue;
                if(bill.price <= price){
                    sellCount+=bill.count;
                }
            }

            long smaller = Math.min(buyCount, sellCount);
            if(smaller > dealCount){
                dealCount = smaller;
                dealPrice = price;
            } else if(smaller == dealCount && price > dealPrice){
                dealPrice = price;
            }
        }

        System.out.println(String.format("%.2f %d", dealPrice, dealCount));

    }
}