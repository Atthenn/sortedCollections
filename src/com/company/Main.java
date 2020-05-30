package com.company;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp =new StockItem("car" , 5.6, 7);
        stockList.addStock(temp);

        temp =new StockItem("chair" , 5.6, 7);
        stockList.addStock(temp);

        temp =new StockItem("cup" , 5.6, 7);
        stockList.addStock(temp);

        temp =new StockItem("door" , 5.6, 7);
        stockList.addStock(temp);

        temp =new StockItem("juice" , 5.6, 7);
        stockList.addStock(temp);

        temp =new StockItem("phone" , 5.6, 7);
        stockList.addStock(temp);

        temp =new StockItem("towel" , 5.6, 7);
        stockList.addStock(temp);

        temp =new StockItem("vase" , 5.6, 7);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }
    }
}
