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
        temp =new StockItem("cup" , 4.6, 8);
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

        Basket timBasket = new Basket("Tim");
        sellItem(timBasket,"car",1);
        System.out.println(timBasket);

        sellItem(timBasket,"car",1);
        System.out.println(timBasket);

        sellItem(timBasket,"car",1);
        sellItem(timBasket,"spanner",5);
        System.out.println(timBasket);

        sellItem(timBasket,"car",1);
        sellItem(timBasket,"spanner",5);
        sellItem(timBasket,"bread",1);
        System.out.println(timBasket);

        System.out.println(stockList);

        //gives error because of unmodifiable list
        //temp =  new StockItem("pen", 1.12);
        //stockList.Items().put(temp.getName(),temp);

        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);



    }
    public static int sellItem(Basket basket, String item, int quantity){

        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " +  item);
            return  0;
        }
        if(stockList.sellStocke(item,quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return  0;
    }
}
